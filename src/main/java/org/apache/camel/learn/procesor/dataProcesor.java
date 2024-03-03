package org.apache.camel.learn.procesor;

import org.apache.camel.learn.model.dataModel;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class dataProcesor implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        ArrayList<dataModel> list = (ArrayList) exchange.getIn().getBody();
        Integer informacionCargada = 0;
        Integer informacionErronea = 0;
        String crearTabla = "CREATE TABLE IF NOT EXISTS registros (\n" +
                "    id INT ,\n" +
                "    limit_bal INT,\n" +
                "    sex INT,\n" +
                "    education INT,\n" +
                "    marriage INT,\n" +
                "    age INT,\n" +
                "    day_pay_0 INT,\n" +
                "    day_pay_2 INT,\n" +
                "    day_pay_3 INT,\n" +
                "    day_pay_4 INT,\n" +
                "    day_pay_5 INT,\n" +
                "    day_pay_6 INT,\n" +
                "    bill_1 INT,\n" +
                "    bill_2 INT,\n" +
                "    bill_3 INT,\n" +
                "    bill_4 INT,\n" +
                "    bill_5 INT,\n" +
                "    bill_6 INT,\n" +
                "    pay_1 INT,\n" +
                "    pay_2 INT,\n" +
                "    pay_3 INT,\n" +
                "    pay_4 INT,\n" +
                "    pay_5 INT,\n" +
                "    pay_6 INT,\n" +
                "    default_payment INT\n" +
                ");\n";
        String ingresarRegistro="";
        for(dataModel data : list){
            if (data.getBill_1()>0
                    && data.getBill_2()>0
                    && data.getBill_3()>0
                    && data.getBill_4()>0
                    && data.getBill_5()>0
                    && data.getBill_6()>0
                    && data.getPay_1()>0
                    && data.getPay_2()>0
                    && data.getPay_2()>0
                    && data.getPay_3()>0
                    && data.getPay_4()>0
                    && data.getPay_5()>0
                    && data.getPay_6()>0 ){
                ingresarRegistro += ("INSERT INTO registros (id, limit_bal, sex, education, marriage, age, day_pay_0, day_pay_2, day_pay_3, day_pay_4, day_pay_5, day_pay_6, bill_1, bill_2, bill_3, bill_4, bill_5, bill_6, pay_1, pay_2, pay_3, pay_4, pay_5, pay_6, default_payment)\n" +
                        "VALUES \n" +
                        "(" + data.getId() + ", " + data.getLimit_bal() + ", " + data.getSex() + ", " + data.getEducation() + ", " + data.getMarriage() + ", " + data.getAge() + ", " + data.getDay_pay_0() + ", " + data.getDay_pay_2() + ", " + data.getDay_pay_3() + ", " + data.getDay_pay_4() + ", " + data.getDay_pay_5() + ", " + data.getDay_pay_6() + ", " + data.getBill_1() + ", " + data.getBill_2() + ", " + data.getBill_3() + ", " + data.getBill_4() + ", " + data.getBill_5() + ", " + data.getBill_6() + ", " + data.getPay_1() + ", " + data.getPay_2() + ", " + data.getPay_3() + ", " + data.getPay_4() + ", " + data.getPay_5() + ", " + data.getPay_6() + ", " + data.getDefault_payment() + ");\n");
            } else {
                informacionErronea++;
            }
            informacionCargada++;
        }
        String logFileName = "src/datos/logs/log.txt";
        try (FileWriter writer = new FileWriter(logFileName)) {
            writer.write("Información cargada: " + informacionCargada + "\n");
            writer.write("Errores de validación: " + informacionErronea + "\n");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String cadenaFinal =crearTabla.concat(ingresarRegistro);
        exchange.getIn().setBody(cadenaFinal);

    }
}
