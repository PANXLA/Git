package com.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CarsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCarnumberIsNull() {
            addCriterion("CarNumber is null");
            return (Criteria) this;
        }

        public Criteria andCarnumberIsNotNull() {
            addCriterion("CarNumber is not null");
            return (Criteria) this;
        }

        public Criteria andCarnumberEqualTo(String value) {
            addCriterion("CarNumber =", value, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberNotEqualTo(String value) {
            addCriterion("CarNumber <>", value, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberGreaterThan(String value) {
            addCriterion("CarNumber >", value, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberGreaterThanOrEqualTo(String value) {
            addCriterion("CarNumber >=", value, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberLessThan(String value) {
            addCriterion("CarNumber <", value, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberLessThanOrEqualTo(String value) {
            addCriterion("CarNumber <=", value, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberLike(String value) {
            addCriterion("CarNumber like", value, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberNotLike(String value) {
            addCriterion("CarNumber not like", value, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberIn(List<String> values) {
            addCriterion("CarNumber in", values, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberNotIn(List<String> values) {
            addCriterion("CarNumber not in", values, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberBetween(String value1, String value2) {
            addCriterion("CarNumber between", value1, value2, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberNotBetween(String value1, String value2) {
            addCriterion("CarNumber not between", value1, value2, "carnumber");
            return (Criteria) this;
        }

        public Criteria andColorIsNull() {
            addCriterion("Color is null");
            return (Criteria) this;
        }

        public Criteria andColorIsNotNull() {
            addCriterion("Color is not null");
            return (Criteria) this;
        }

        public Criteria andColorEqualTo(String value) {
            addCriterion("Color =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(String value) {
            addCriterion("Color <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(String value) {
            addCriterion("Color >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(String value) {
            addCriterion("Color >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(String value) {
            addCriterion("Color <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(String value) {
            addCriterion("Color <=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLike(String value) {
            addCriterion("Color like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotLike(String value) {
            addCriterion("Color not like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorIn(List<String> values) {
            addCriterion("Color in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<String> values) {
            addCriterion("Color not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(String value1, String value2) {
            addCriterion("Color between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(String value1, String value2) {
            addCriterion("Color not between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andCartypeIsNull() {
            addCriterion("CarType is null");
            return (Criteria) this;
        }

        public Criteria andCartypeIsNotNull() {
            addCriterion("CarType is not null");
            return (Criteria) this;
        }

        public Criteria andCartypeEqualTo(String value) {
            addCriterion("CarType =", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeNotEqualTo(String value) {
            addCriterion("CarType <>", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeGreaterThan(String value) {
            addCriterion("CarType >", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeGreaterThanOrEqualTo(String value) {
            addCriterion("CarType >=", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeLessThan(String value) {
            addCriterion("CarType <", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeLessThanOrEqualTo(String value) {
            addCriterion("CarType <=", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeLike(String value) {
            addCriterion("CarType like", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeNotLike(String value) {
            addCriterion("CarType not like", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeIn(List<String> values) {
            addCriterion("CarType in", values, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeNotIn(List<String> values) {
            addCriterion("CarType not in", values, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeBetween(String value1, String value2) {
            addCriterion("CarType between", value1, value2, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeNotBetween(String value1, String value2) {
            addCriterion("CarType not between", value1, value2, "cartype");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("Price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("Price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("Price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("Price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("Price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("Price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("Price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("Price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("Price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("Price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("Price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("Price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andDepositIsNull() {
            addCriterion("Deposit is null");
            return (Criteria) this;
        }

        public Criteria andDepositIsNotNull() {
            addCriterion("Deposit is not null");
            return (Criteria) this;
        }

        public Criteria andDepositEqualTo(Double value) {
            addCriterion("Deposit =", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotEqualTo(Double value) {
            addCriterion("Deposit <>", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositGreaterThan(Double value) {
            addCriterion("Deposit >", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositGreaterThanOrEqualTo(Double value) {
            addCriterion("Deposit >=", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLessThan(Double value) {
            addCriterion("Deposit <", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLessThanOrEqualTo(Double value) {
            addCriterion("Deposit <=", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositIn(List<Double> values) {
            addCriterion("Deposit in", values, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotIn(List<Double> values) {
            addCriterion("Deposit not in", values, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositBetween(Double value1, Double value2) {
            addCriterion("Deposit between", value1, value2, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotBetween(Double value1, Double value2) {
            addCriterion("Deposit not between", value1, value2, "deposit");
            return (Criteria) this;
        }

        public Criteria andRentpriceIsNull() {
            addCriterion("RentPrice is null");
            return (Criteria) this;
        }

        public Criteria andRentpriceIsNotNull() {
            addCriterion("RentPrice is not null");
            return (Criteria) this;
        }

        public Criteria andRentpriceEqualTo(Double value) {
            addCriterion("RentPrice =", value, "rentprice");
            return (Criteria) this;
        }

        public Criteria andRentpriceNotEqualTo(Double value) {
            addCriterion("RentPrice <>", value, "rentprice");
            return (Criteria) this;
        }

        public Criteria andRentpriceGreaterThan(Double value) {
            addCriterion("RentPrice >", value, "rentprice");
            return (Criteria) this;
        }

        public Criteria andRentpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("RentPrice >=", value, "rentprice");
            return (Criteria) this;
        }

        public Criteria andRentpriceLessThan(Double value) {
            addCriterion("RentPrice <", value, "rentprice");
            return (Criteria) this;
        }

        public Criteria andRentpriceLessThanOrEqualTo(Double value) {
            addCriterion("RentPrice <=", value, "rentprice");
            return (Criteria) this;
        }

        public Criteria andRentpriceIn(List<Double> values) {
            addCriterion("RentPrice in", values, "rentprice");
            return (Criteria) this;
        }

        public Criteria andRentpriceNotIn(List<Double> values) {
            addCriterion("RentPrice not in", values, "rentprice");
            return (Criteria) this;
        }

        public Criteria andRentpriceBetween(Double value1, Double value2) {
            addCriterion("RentPrice between", value1, value2, "rentprice");
            return (Criteria) this;
        }

        public Criteria andRentpriceNotBetween(Double value1, Double value2) {
            addCriterion("RentPrice not between", value1, value2, "rentprice");
            return (Criteria) this;
        }

        public Criteria andIsrentingIsNull() {
            addCriterion("isRenting is null");
            return (Criteria) this;
        }

        public Criteria andIsrentingIsNotNull() {
            addCriterion("isRenting is not null");
            return (Criteria) this;
        }

        public Criteria andIsrentingEqualTo(String value) {
            addCriterion("isRenting =", value, "isrenting");
            return (Criteria) this;
        }

        public Criteria andIsrentingNotEqualTo(String value) {
            addCriterion("isRenting <>", value, "isrenting");
            return (Criteria) this;
        }

        public Criteria andIsrentingGreaterThan(String value) {
            addCriterion("isRenting >", value, "isrenting");
            return (Criteria) this;
        }

        public Criteria andIsrentingGreaterThanOrEqualTo(String value) {
            addCriterion("isRenting >=", value, "isrenting");
            return (Criteria) this;
        }

        public Criteria andIsrentingLessThan(String value) {
            addCriterion("isRenting <", value, "isrenting");
            return (Criteria) this;
        }

        public Criteria andIsrentingLessThanOrEqualTo(String value) {
            addCriterion("isRenting <=", value, "isrenting");
            return (Criteria) this;
        }

        public Criteria andIsrentingLike(String value) {
            addCriterion("isRenting like", value, "isrenting");
            return (Criteria) this;
        }

        public Criteria andIsrentingNotLike(String value) {
            addCriterion("isRenting not like", value, "isrenting");
            return (Criteria) this;
        }

        public Criteria andIsrentingIn(List<String> values) {
            addCriterion("isRenting in", values, "isrenting");
            return (Criteria) this;
        }

        public Criteria andIsrentingNotIn(List<String> values) {
            addCriterion("isRenting not in", values, "isrenting");
            return (Criteria) this;
        }

        public Criteria andIsrentingBetween(String value1, String value2) {
            addCriterion("isRenting between", value1, value2, "isrenting");
            return (Criteria) this;
        }

        public Criteria andIsrentingNotBetween(String value1, String value2) {
            addCriterion("isRenting not between", value1, value2, "isrenting");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("Description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("Description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("Description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("Description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("Description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("Description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("Description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("Description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("Description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("Description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("Description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("Description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("Description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("Description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andBuyTimeIsNull() {
            addCriterion("buy_time is null");
            return (Criteria) this;
        }

        public Criteria andBuyTimeIsNotNull() {
            addCriterion("buy_time is not null");
            return (Criteria) this;
        }

        public Criteria andBuyTimeEqualTo(Date value) {
            addCriterionForJDBCDate("buy_time =", value, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("buy_time <>", value, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("buy_time >", value, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("buy_time >=", value, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeLessThan(Date value) {
            addCriterionForJDBCDate("buy_time <", value, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("buy_time <=", value, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeIn(List<Date> values) {
            addCriterionForJDBCDate("buy_time in", values, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("buy_time not in", values, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("buy_time between", value1, value2, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("buy_time not between", value1, value2, "buyTime");
            return (Criteria) this;
        }

        public Criteria andCarimagIsNull() {
            addCriterion("carimag is null");
            return (Criteria) this;
        }

        public Criteria andCarimagIsNotNull() {
            addCriterion("carimag is not null");
            return (Criteria) this;
        }

        public Criteria andCarimagEqualTo(String value) {
            addCriterion("carimag =", value, "carimag");
            return (Criteria) this;
        }

        public Criteria andCarimagNotEqualTo(String value) {
            addCriterion("carimag <>", value, "carimag");
            return (Criteria) this;
        }

        public Criteria andCarimagGreaterThan(String value) {
            addCriterion("carimag >", value, "carimag");
            return (Criteria) this;
        }

        public Criteria andCarimagGreaterThanOrEqualTo(String value) {
            addCriterion("carimag >=", value, "carimag");
            return (Criteria) this;
        }

        public Criteria andCarimagLessThan(String value) {
            addCriterion("carimag <", value, "carimag");
            return (Criteria) this;
        }

        public Criteria andCarimagLessThanOrEqualTo(String value) {
            addCriterion("carimag <=", value, "carimag");
            return (Criteria) this;
        }

        public Criteria andCarimagLike(String value) {
            addCriterion("carimag like", value, "carimag");
            return (Criteria) this;
        }

        public Criteria andCarimagNotLike(String value) {
            addCriterion("carimag not like", value, "carimag");
            return (Criteria) this;
        }

        public Criteria andCarimagIn(List<String> values) {
            addCriterion("carimag in", values, "carimag");
            return (Criteria) this;
        }

        public Criteria andCarimagNotIn(List<String> values) {
            addCriterion("carimag not in", values, "carimag");
            return (Criteria) this;
        }

        public Criteria andCarimagBetween(String value1, String value2) {
            addCriterion("carimag between", value1, value2, "carimag");
            return (Criteria) this;
        }

        public Criteria andCarimagNotBetween(String value1, String value2) {
            addCriterion("carimag not between", value1, value2, "carimag");
            return (Criteria) this;
        }

        public Criteria andInsurainfoIsNull() {
            addCriterion("insurainfo is null");
            return (Criteria) this;
        }

        public Criteria andInsurainfoIsNotNull() {
            addCriterion("insurainfo is not null");
            return (Criteria) this;
        }

        public Criteria andInsurainfoEqualTo(String value) {
            addCriterion("insurainfo =", value, "insurainfo");
            return (Criteria) this;
        }

        public Criteria andInsurainfoNotEqualTo(String value) {
            addCriterion("insurainfo <>", value, "insurainfo");
            return (Criteria) this;
        }

        public Criteria andInsurainfoGreaterThan(String value) {
            addCriterion("insurainfo >", value, "insurainfo");
            return (Criteria) this;
        }

        public Criteria andInsurainfoGreaterThanOrEqualTo(String value) {
            addCriterion("insurainfo >=", value, "insurainfo");
            return (Criteria) this;
        }

        public Criteria andInsurainfoLessThan(String value) {
            addCriterion("insurainfo <", value, "insurainfo");
            return (Criteria) this;
        }

        public Criteria andInsurainfoLessThanOrEqualTo(String value) {
            addCriterion("insurainfo <=", value, "insurainfo");
            return (Criteria) this;
        }

        public Criteria andInsurainfoLike(String value) {
            addCriterion("insurainfo like", value, "insurainfo");
            return (Criteria) this;
        }

        public Criteria andInsurainfoNotLike(String value) {
            addCriterion("insurainfo not like", value, "insurainfo");
            return (Criteria) this;
        }

        public Criteria andInsurainfoIn(List<String> values) {
            addCriterion("insurainfo in", values, "insurainfo");
            return (Criteria) this;
        }

        public Criteria andInsurainfoNotIn(List<String> values) {
            addCriterion("insurainfo not in", values, "insurainfo");
            return (Criteria) this;
        }

        public Criteria andInsurainfoBetween(String value1, String value2) {
            addCriterion("insurainfo between", value1, value2, "insurainfo");
            return (Criteria) this;
        }

        public Criteria andInsurainfoNotBetween(String value1, String value2) {
            addCriterion("insurainfo not between", value1, value2, "insurainfo");
            return (Criteria) this;
        }

        public Criteria andWeihuinfoIsNull() {
            addCriterion("weihuinfo is null");
            return (Criteria) this;
        }

        public Criteria andWeihuinfoIsNotNull() {
            addCriterion("weihuinfo is not null");
            return (Criteria) this;
        }

        public Criteria andWeihuinfoEqualTo(String value) {
            addCriterion("weihuinfo =", value, "weihuinfo");
            return (Criteria) this;
        }

        public Criteria andWeihuinfoNotEqualTo(String value) {
            addCriterion("weihuinfo <>", value, "weihuinfo");
            return (Criteria) this;
        }

        public Criteria andWeihuinfoGreaterThan(String value) {
            addCriterion("weihuinfo >", value, "weihuinfo");
            return (Criteria) this;
        }

        public Criteria andWeihuinfoGreaterThanOrEqualTo(String value) {
            addCriterion("weihuinfo >=", value, "weihuinfo");
            return (Criteria) this;
        }

        public Criteria andWeihuinfoLessThan(String value) {
            addCriterion("weihuinfo <", value, "weihuinfo");
            return (Criteria) this;
        }

        public Criteria andWeihuinfoLessThanOrEqualTo(String value) {
            addCriterion("weihuinfo <=", value, "weihuinfo");
            return (Criteria) this;
        }

        public Criteria andWeihuinfoLike(String value) {
            addCriterion("weihuinfo like", value, "weihuinfo");
            return (Criteria) this;
        }

        public Criteria andWeihuinfoNotLike(String value) {
            addCriterion("weihuinfo not like", value, "weihuinfo");
            return (Criteria) this;
        }

        public Criteria andWeihuinfoIn(List<String> values) {
            addCriterion("weihuinfo in", values, "weihuinfo");
            return (Criteria) this;
        }

        public Criteria andWeihuinfoNotIn(List<String> values) {
            addCriterion("weihuinfo not in", values, "weihuinfo");
            return (Criteria) this;
        }

        public Criteria andWeihuinfoBetween(String value1, String value2) {
            addCriterion("weihuinfo between", value1, value2, "weihuinfo");
            return (Criteria) this;
        }

        public Criteria andWeihuinfoNotBetween(String value1, String value2) {
            addCriterion("weihuinfo not between", value1, value2, "weihuinfo");
            return (Criteria) this;
        }

        public Criteria andWeizhanginfoIsNull() {
            addCriterion("weizhanginfo is null");
            return (Criteria) this;
        }

        public Criteria andWeizhanginfoIsNotNull() {
            addCriterion("weizhanginfo is not null");
            return (Criteria) this;
        }

        public Criteria andWeizhanginfoEqualTo(String value) {
            addCriterion("weizhanginfo =", value, "weizhanginfo");
            return (Criteria) this;
        }

        public Criteria andWeizhanginfoNotEqualTo(String value) {
            addCriterion("weizhanginfo <>", value, "weizhanginfo");
            return (Criteria) this;
        }

        public Criteria andWeizhanginfoGreaterThan(String value) {
            addCriterion("weizhanginfo >", value, "weizhanginfo");
            return (Criteria) this;
        }

        public Criteria andWeizhanginfoGreaterThanOrEqualTo(String value) {
            addCriterion("weizhanginfo >=", value, "weizhanginfo");
            return (Criteria) this;
        }

        public Criteria andWeizhanginfoLessThan(String value) {
            addCriterion("weizhanginfo <", value, "weizhanginfo");
            return (Criteria) this;
        }

        public Criteria andWeizhanginfoLessThanOrEqualTo(String value) {
            addCriterion("weizhanginfo <=", value, "weizhanginfo");
            return (Criteria) this;
        }

        public Criteria andWeizhanginfoLike(String value) {
            addCriterion("weizhanginfo like", value, "weizhanginfo");
            return (Criteria) this;
        }

        public Criteria andWeizhanginfoNotLike(String value) {
            addCriterion("weizhanginfo not like", value, "weizhanginfo");
            return (Criteria) this;
        }

        public Criteria andWeizhanginfoIn(List<String> values) {
            addCriterion("weizhanginfo in", values, "weizhanginfo");
            return (Criteria) this;
        }

        public Criteria andWeizhanginfoNotIn(List<String> values) {
            addCriterion("weizhanginfo not in", values, "weizhanginfo");
            return (Criteria) this;
        }

        public Criteria andWeizhanginfoBetween(String value1, String value2) {
            addCriterion("weizhanginfo between", value1, value2, "weizhanginfo");
            return (Criteria) this;
        }

        public Criteria andWeizhanginfoNotBetween(String value1, String value2) {
            addCriterion("weizhanginfo not between", value1, value2, "weizhanginfo");
            return (Criteria) this;
        }

        public Criteria andTimerangeIsNull() {
            addCriterion("timerange is null");
            return (Criteria) this;
        }

        public Criteria andTimerangeIsNotNull() {
            addCriterion("timerange is not null");
            return (Criteria) this;
        }

        public Criteria andTimerangeEqualTo(Integer value) {
            addCriterion("timerange =", value, "timerange");
            return (Criteria) this;
        }

        public Criteria andTimerangeNotEqualTo(Integer value) {
            addCriterion("timerange <>", value, "timerange");
            return (Criteria) this;
        }

        public Criteria andTimerangeGreaterThan(Integer value) {
            addCriterion("timerange >", value, "timerange");
            return (Criteria) this;
        }

        public Criteria andTimerangeGreaterThanOrEqualTo(Integer value) {
            addCriterion("timerange >=", value, "timerange");
            return (Criteria) this;
        }

        public Criteria andTimerangeLessThan(Integer value) {
            addCriterion("timerange <", value, "timerange");
            return (Criteria) this;
        }

        public Criteria andTimerangeLessThanOrEqualTo(Integer value) {
            addCriterion("timerange <=", value, "timerange");
            return (Criteria) this;
        }

        public Criteria andTimerangeIn(List<Integer> values) {
            addCriterion("timerange in", values, "timerange");
            return (Criteria) this;
        }

        public Criteria andTimerangeNotIn(List<Integer> values) {
            addCriterion("timerange not in", values, "timerange");
            return (Criteria) this;
        }

        public Criteria andTimerangeBetween(Integer value1, Integer value2) {
            addCriterion("timerange between", value1, value2, "timerange");
            return (Criteria) this;
        }

        public Criteria andTimerangeNotBetween(Integer value1, Integer value2) {
            addCriterion("timerange not between", value1, value2, "timerange");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}