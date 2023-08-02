package com.db.grad.javaapi.sqlconvert;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CSVToSQLConverter {

    public static void main(String[] args) {
        String csvFile = "/C:/Users/Admin/downloads/db-bonds-data.csv";
        String dataSqlFile = "data.sql";
        String tableName = "trade"; // Assuming data is for the "trade" table

        try (CSVParser csvParser = new CSVParser(new FileReader(csvFile), CSVFormat.DEFAULT.withFirstRecordAsHeader())) {
            try (FileWriter fileWriter = new FileWriter(dataSqlFile)) {
                for (CSVRecord record : csvParser) {
                    String tradeType = record.get("trade_type");
                    String tradeCurrency = record.get("trade_currency");
                    int quantity = Integer.parseInt(record.get("quantity"));
                    String tradeSettlementDateStr = record.get("trade_settlement_date");
                    Date tradeSettlementDate = parseDate(tradeSettlementDateStr);
                    String tradeStatus = record.get("trade_status");
                    String tradeDateStr = record.get("trade_date");
                    Date tradeDate = parseDate(tradeDateStr);
                    BigDecimal unitPrice = new BigDecimal(record.get("unit_price"));
                    BigDecimal couponPercent = new BigDecimal(record.get("coupon_percent"));
                    String bondCurrency = record.get("bond_currency");
                    String cusip = record.get("cusip");
                    BigDecimal faceValue = new BigDecimal(record.get("face_value (mn)"));
                    String isin = record.get("isin");
                    String issuerName = record.get("issuer_name");
                    String bondMaturityDateStr = record.get("bond_maturity_date");
                    Date bondMaturityDate = parseDate(bondMaturityDateStr);
                    String status = record.get("status");
                    String type = record.get("type");
                    String bookName = record.get("book_name");
                    String bondHolder = record.get("bond_holder");

                    StringBuilder sqlStatement = new StringBuilder();
                    sqlStatement.append("INSERT INTO ").append(tableName).append(" (trade_type, trade_currency, quantity, trade_settlement_date, trade_status, trade_date, unit_price, coupon_percent, bond_currency, cusip, face_value, isin, issuer_name, bond_maturity_date, status, type, book_name, bond_holder) VALUES (")
                            .append("'").append(tradeType).append("', ")
                            .append("'").append(tradeCurrency).append("', ")
                            .append(quantity).append(", ")
                            .append("'").append(new SimpleDateFormat("yyyy-MM-dd").format(tradeSettlementDate)).append("', ")
                            .append("'").append(tradeStatus).append("', ")
                            .append("'").append(new SimpleDateFormat("yyyy-MM-dd").format(tradeDate)).append("', ")
                            .append(unitPrice).append(", ")
                            .append(couponPercent).append(", ")
                            .append("'").append(bondCurrency).append("', ")
                            .append("'").append(cusip).append("', ")
                            .append(faceValue).append(", ")
                            .append("'").append(isin).append("', ")
                            .append("'").append(issuerName).append("', ")
                            .append("'").append(new SimpleDateFormat("yyyy-MM-dd").format(bondMaturityDate)).append("', ")
                            .append("'").append(status).append("', ")
                            .append("'").append(type).append("', ")
                            .append("'").append(bookName).append("', ")
                            .append("'").append(bondHolder).append("'")
                            .append(");\n");
                    fileWriter.write(sqlStatement.toString());
                }
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    private static Date parseDate(String dateString) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy"); // Adjust the date format as per the CSV data
        return dateFormat.parse(dateString);
    }
}
