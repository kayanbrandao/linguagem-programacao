package br.com.univag.negocio;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;

public class Fatura {

    private ArrayList<ItemFatura> itensFatura;
    private LocalDateTime dataFatura;

    // construtor
    public Fatura() {
        itensFatura = new ArrayList<>();
        dataFatura = LocalDateTime.now();
    }

    public void adicionarItem(ItemFatura itemFatura) {
        itensFatura.add(itemFatura);
    }

    public ArrayList<ItemFatura> getItensFatura() {
        return itensFatura;
    }

    public double getTotal() {
        double totalFatura = 0;
        for (ItemFatura itemFatura : itensFatura) {
            totalFatura += itemFatura.getTotal();
        }
        return totalFatura;
    }

    public String getTotalFormatado() {
        NumberFormat moeda = NumberFormat.getCurrencyInstance();
        return moeda.format(getTotal());
    }

    public void setDataFatura(LocalDateTime dataFatura) {
        this.dataFatura = dataFatura;
    }

    public LocalDateTime getDataFatura() {
        return dataFatura;
    }

    public String getDataFaturaFormatada() {
        DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        return dtf.format(dataFatura);
    }

    public LocalDateTime getDataDeVencimento(){
        return this.dataFatura.plusDays(30);
    }

    public String getDataDeVencimentoFormatada(){
        DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        return dtf.format(getDataDeVencimento());
    }
}