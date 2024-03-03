package org.apache.camel.learn;

import org.apache.camel.learn.model.dataModel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.dataformat.bindy.csv.BindyCsvDataFormat;
import org.apache.camel.spi.DataFormat;
import org.apache.camel.learn.procesor.dataProcesor;

public class MyRouteBuilder extends RouteBuilder {

    DataFormat bindy = new BindyCsvDataFormat(dataModel.class);

    public void configure() throws Exception {
        from("file:src/datos?noop=True&fileName=cardsclients.csv")
                .unmarshal(bindy)
                .process(new dataProcesor())
                .to("jdbc:myDataSource")
                .log("La lectura del archivo ha finalizado.")
                .log("Se creó un archivo src/datos/logs/log.txt en el cual se encuentra información de los registros procesados");

    }
}
