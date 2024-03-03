package org.apache.camel.learn.model;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord(separator = ",")
public class dataModel {


    @DataField(pos = 1)
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLimit_bal() {
        return limit_bal;
    }

    public void setLimit_bal(String limit_bal) {
        this.limit_bal = limit_bal;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getMarriage() {
        return marriage;
    }

    public void setMarriage(String marriage) {
        this.marriage = marriage;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDay_pay_0() {
        return day_pay_0;
    }

    public void setDay_pay_0(String day_pay_0) {
        this.day_pay_0 = day_pay_0;
    }

    public String getDay_pay_2() {
        return day_pay_2;
    }

    public void setDay_pay_2(String day_pay_2) {
        this.day_pay_2 = day_pay_2;
    }

    public String getDay_pay_3() {
        return day_pay_3;
    }

    public void setDay_pay_3(String day_pay_3) {
        this.day_pay_3 = day_pay_3;
    }

    public String getDay_pay_4() {
        return day_pay_4;
    }

    public void setDay_pay_4(String day_pay_4) {
        this.day_pay_4 = day_pay_4;
    }

    public String getDay_pay_5() {
        return day_pay_5;
    }

    public void setDay_pay_5(String day_pay_5) {
        this.day_pay_5 = day_pay_5;
    }

    public String getDay_pay_6() {
        return day_pay_6;
    }

    public void setDay_pay_6(String day_pay_6) {
        this.day_pay_6 = day_pay_6;
    }

    public Integer getBill_1() {
        return bill_1;
    }

    public void setBill_1(Integer bill_1) {
        this.bill_1 = bill_1;
    }

    public Integer getBill_2() {
        return bill_2;
    }

    public void setBill_2(Integer bill_2) {
        this.bill_2 = bill_2;
    }

    public Integer getBill_3() {
        return bill_3;
    }

    public void setBill_3(Integer bill_3) {
        this.bill_3 = bill_3;
    }

    public Integer getBill_4() {
        return bill_4;
    }

    public void setBill_4(Integer bill_4) {
        this.bill_4 = bill_4;
    }

    public Integer getBill_5() {
        return bill_5;
    }

    public void setBill_5(Integer bill_5) {
        this.bill_5 = bill_5;
    }

    public Integer getBill_6() {
        return bill_6;
    }

    public void setBill_6(Integer bill_6) {
        this.bill_6 = bill_6;
    }

    public Integer getPay_1() {
        return pay_1;
    }

    public void setPay_1(Integer pay_1) {
        this.pay_1 = pay_1;
    }

    public Integer getPay_2() {
        return pay_2;
    }

    public void setPay_2(Integer pay_2) {
        this.pay_2 = pay_2;
    }

    public Integer getPay_3() {
        return pay_3;
    }

    public void setPay_3(Integer pay_3) {
        this.pay_3 = pay_3;
    }

    public Integer getPay_4() {
        return pay_4;
    }

    public void setPay_4(Integer pay_4) {
        this.pay_4 = pay_4;
    }

    public Integer getPay_5() {
        return pay_5;
    }

    public void setPay_5(Integer pay_5) {
        this.pay_5 = pay_5;
    }

    public Integer getPay_6() {
        return pay_6;
    }

    public void setPay_6(Integer pay_6) {
        this.pay_6 = pay_6;
    }

    public String getDefault_payment() {
        return default_payment;
    }

    public void setDefault_payment(String default_payment) {
        this.default_payment = default_payment;
    }

    @DataField(pos = 2)
    private String limit_bal;
    @DataField(pos = 3)
    private String sex;
    @DataField(pos = 4)
    private String education;
    @DataField(pos = 5)
    private String marriage;
    @DataField(pos = 6)
    private String age;
    @DataField(pos = 7)
    private String day_pay_0;
    @DataField(pos = 8)
    private String day_pay_2;
    @DataField(pos = 9)
    private String day_pay_3;
    @DataField(pos = 10)
    private String day_pay_4;
    @DataField(pos = 11)
    private String day_pay_5;
    @DataField(pos = 12)
    private String day_pay_6;
    @DataField(pos = 13)
    private Integer bill_1;
    @DataField(pos = 14)
    private Integer bill_2;
    @DataField(pos = 15)
    private Integer bill_3;
    @DataField(pos = 16)
    private Integer bill_4;
    @DataField(pos = 17)
    private Integer bill_5;
    @DataField(pos = 18)
    private Integer bill_6;
    @DataField(pos = 19)
    private Integer pay_1;
    @DataField(pos = 20)
    private Integer pay_2;
    @DataField(pos = 21)
    private Integer pay_3;
    @DataField(pos = 22)
    private Integer pay_4;
    @DataField(pos = 23)
    private Integer pay_5;
    @DataField(pos = 24)
    private Integer pay_6;
    @DataField(pos = 25)
    private String default_payment;

    @Override
    public String toString() {
        return "dataModel{" +
                "id='" + id + '\'' +
                ", limit_bal='" + limit_bal + '\'' +
                ", sex='" + sex + '\'' +
                ", education='" + education + '\'' +
                ", marriage='" + marriage + '\'' +
                ", age='" + age + '\'' +
                ", day_pay_0='" + day_pay_0 + '\'' +
                ", day_pay_2='" + day_pay_2 + '\'' +
                ", day_pay_3='" + day_pay_3 + '\'' +
                ", day_pay_4='" + day_pay_4 + '\'' +
                ", day_pay_5='" + day_pay_5 + '\'' +
                ", day_pay_6='" + day_pay_6 + '\'' +
                ", bill_1=" + bill_1 +
                ", bill_2=" + bill_2 +
                ", bill_3=" + bill_3 +
                ", bill_4=" + bill_4 +
                ", bill_5=" + bill_5 +
                ", bill_6=" + bill_6 +
                ", pay_1=" + pay_1 +
                ", pay_2=" + pay_2 +
                ", pay_3=" + pay_3 +
                ", pay_4=" + pay_4 +
                ", pay_5=" + pay_5 +
                ", pay_6=" + pay_6 +
                ", default_payment='" + default_payment + '\'' +
                '}';
    }
}
