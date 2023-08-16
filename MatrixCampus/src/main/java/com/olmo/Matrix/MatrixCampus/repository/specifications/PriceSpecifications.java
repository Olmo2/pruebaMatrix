package com.olmo.Matrix.MatrixCampus.repository.specifications;

import java.time.LocalDateTime;

import org.springframework.data.jpa.domain.Specification;

import com.olmo.Matrix.MatrixCampus.beans.Price;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

public class PriceSpecifications {

	 public Specification<Price> priceHasPrice(Float price){
		 return new Specification<Price>() {
			private static final long serialVersionUID = 1L;

			@Override
			public Predicate toPredicate(Root<Price> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				query.orderBy(cb.desc(root.get("priority")));
				return cb.equal(root.get("price"),price);
			}
		};
	 }
	 
	 public Specification<Price> priceHasBrandId(Integer brandId){
		 return new Specification<Price>() {
			private static final long serialVersionUID = 1L;

			@Override
			public Predicate toPredicate(Root<Price> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				query.orderBy(cb.desc(root.get("priority")));
				return cb.equal(root.get("brandId"),brandId);
			}
		};
	 }
	 
	 public Specification<Price> priceHasProductId(Integer productId){
		 return new Specification<Price>() {
			private static final long serialVersionUID = 1L;

			@Override
			public Predicate toPredicate(Root<Price> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				query.orderBy(cb.desc(root.get("priority")));
				return cb.equal(root.get("productId"),productId);
			}
		};
	 }
	 
	 public Specification<Price> priceStartDateBefore(LocalDateTime startDate){
		 return new Specification<Price>() {
			private static final long serialVersionUID = 1L;

			@Override
			public Predicate toPredicate(Root<Price> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				query.orderBy(cb.desc(root.get("priority")));
				return cb.lessThan(root.get("startDate"),startDate);
			}
		};
	 }
	 
	 public Specification<Price> priceEndDateAfter(LocalDateTime endDate){
		 return new Specification<Price>() {
			private static final long serialVersionUID = 1L;

			@Override
			public Predicate toPredicate(Root<Price> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				query.orderBy(cb.desc(root.get("priority")));
				return cb.greaterThan(root.get("endDate"),endDate);
			}
		};
	 }
	 
	 
	 
	}