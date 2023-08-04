package com.olmo.Matrix.MatrixCampus.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.olmo.Matrix.MatrixCampus.Beans.Cadena;
import com.olmo.Matrix.MatrixCampus.Beans.ObjEntrada;
import com.olmo.Matrix.MatrixCampus.Beans.ObjSalida;
import com.olmo.Matrix.MatrixCampus.Beans.Price;
import com.olmo.Matrix.MatrixCampus.Repo.CadenaDAO;
import com.olmo.Matrix.MatrixCampus.Repo.PriceDAO;

@Service
public class Services {
	
	@Autowired
	PriceDAO priceDAO;
	
	@Autowired
	CadenaDAO cadenaDAO;
		
	/**
	 * Devulve todos los "PRICES" de la base de datos
	 * @return List de PRICE
	 */
	public List<Price> getAllPrices() {
		List<Price>result = new ArrayList<Price>();
		 priceDAO.findAll().forEach(result::add);
		return result;
	}
	
	/**
	 * Devuelve los "PRICES" filtrando por los campos del @param objEntrada
	 * @param objEntrada obj con los parametros para el filtrado, Brand id, product Id, Start DAte, End Date
	 * @return List  de PRICE
	 */
	public List<ObjSalida> getPrices(ObjEntrada objEntrada) {
		List<Price>result = new ArrayList<Price>();
		
		 priceDAO.findByBRANDIDAndPRODUCTIDAndSTARTDATEBeforeAndENDDATEAfterOrderByPRIORITYDesc(objEntrada.getIdCadena(),objEntrada.getIdProducto(),
					objEntrada.getFechaInicio(),objEntrada.getFechaInicio()).forEach(result::add);
		return toListObjSalida(result);
	}
	
	/**
	 * Devuelve todas las cadenas
	 * @return List de Cadenas
	 */
	public List<Cadena> getAllCadenas() {
		List<Cadena> result = new ArrayList<Cadena>();
		 cadenaDAO.findAll().forEach(result::add);
		 
		 System.out.println(result);
		return result;
	}
	
	/**
	 * Metodo auxiliar para transformar un price a un objSalida
	 * @param price el obj price a transformar
	 * @return el objSalida
	 */
	private ObjSalida toObjSalida(Price price) {
		ObjSalida salida = new ObjSalida();
		
		salida.setCurr(price.getCURR());
		salida.setFechaFinAplicacion(price.getENDDATE());
		salida.setFechaInicioAplicacion(price.getSTARTDATE());
		salida.setIdCadena(price.getBRANDID());
		salida.setIdProducto(price.getPRODUCTID());
		salida.setPrecioFinal(price.getPRICE());
		salida.setTarifa(salida.getTarifa());
		
		return salida;
		
	}
	/**
	 * Metodo auxiliar para transformar una lista de price a una lista de objSalida
	 * @param prices la lista de obj price a transformar
	 * @return la lista de objSalida
	 */
	private List<ObjSalida> toListObjSalida(List<Price> prices){
		List<ObjSalida> salida = new ArrayList<ObjSalida>();
		for (Price price : prices) {
			salida.add(toObjSalida(price));
		}
		
		return salida;
	}

}
