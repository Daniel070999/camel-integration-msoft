package org.apache.camel.learn.procesor;

import org.apache.camel.learn.model.dataModel;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class dataProcesor implements Processor {
    private static final String CREATE_TABLE_SQL = "CREATE TABLE IF NOT EXISTS registros (\n" +
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

    @Override
    public void process(Exchange exchange) throws Exception {
        ArrayList<dataModel> list = exchange.getIn().getBody(ArrayList.class);
        int informacionCargada = 0;
        int informacionErronea = 0;
        StringBuilder ingresarRegistro = new StringBuilder();

        for (dataModel data : list) {
            if (isValidData(data)) {
                ingresarRegistro.append("INSERT INTO registros (id, limit_bal, sex, education, marriage, age, day_pay_0, day_pay_2, day_pay_3, day_pay_4, day_pay_5, day_pay_6, bill_1, bill_2, bill_3, bill_4, bill_5, bill_6, pay_1, pay_2, pay_3, pay_4, pay_5, pay_6, default_payment)\n")
                        .append("VALUES (")
                        .append(data.getId()).append(", ")
                        .append(data.getLimit_bal()).append(", ")
                        .append(data.getSex()).append(", ")
                        .append(data.getEducation()).append(", ")
                        .append(data.getMarriage()).append(", ")
                        .append(data.getAge()).append(", ")
                        .append(data.getDay_pay_0()).append(", ")
                        .append(data.getDay_pay_2()).append(", ")
                        .append(data.getDay_pay_3()).append(", ")
                        .append(data.getDay_pay_4()).append(", ")
                        .append(data.getDay_pay_5()).append(", ")
                        .append(data.getDay_pay_6()).append(", ")
                        .append(data.getBill_1()).append(", ")
                        .append(data.getBill_2()).append(", ")
                        .append(data.getBill_3()).append(", ")
                        .append(data.getBill_4()).append(", ")
                        .append(data.getBill_5()).append(", ")
                        .append(data.getBill_6()).append(", ")
                        .append(data.getPay_1()).append(", ")
                        .append(data.getPay_2()).append(", ")
                        .append(data.getPay_3()).append(", ")
                        .append(data.getPay_4()).append(", ")
                        .append(data.getPay_5()).append(", ")
                        .append(data.getPay_6()).append(", ")
                        .append(data.getDefault_payment()).append(");\n");
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
            // Manejar la excepción de manera adecuada según el contexto de tu aplicación
            e.printStackTrace();
        }

        String cadenaFinal = CREATE_TABLE_SQL + ingresarRegistro.toString();
        exchange.getIn().setBody(cadenaFinal);
    }

    private boolean isValidData(dataModel data) {
        return data.getBill_1() > 0 && data.getBill_2() > 0 && data.getBill_3() > 0 &&
                data.getBill_4() > 0 && data.getBill_5() > 0 && data.getBill_6() > 0 &&
                data.getPay_1() > 0 && data.getPay_2() > 0 && data.getPay_2() > 0 &&
                data.getPay_3() > 0 && data.getPay_4() > 0 && data.getPay_5() > 0 &&
                data.getPay_6() > 0;
    }
}