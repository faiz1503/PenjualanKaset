/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualan;

import javax.swing.table.DefaultTableModel;

public class ModelPenjualan {
    private double subTotal=0;
    private double ppn=0;
    private double total=0;
    private double diskon;

    private DefaultTableModel tabel = new DefaultTableModel();
    
    public ModelPenjualan(){
        getTabel().addColumn("Barang");
        getTabel().addColumn("Harga");
        getTabel().addColumn("Qty");
        getTabel().addColumn("Penyanyi");
        getTabel().addColumn("Jumlah");
    }

    public double countSubtotal(){
        subTotal=0;
        for (int i=0;i<tabel.getRowCount();i++){
            subTotal=subTotal+Double.parseDouble(tabel.getValueAt(i, 4).toString());
        }
        return subTotal;
    }
    public double countPPN(){
        ppn=subTotal*0.1;
        return ppn;
    }
    public double countTotal(){
        total=subTotal+ppn;
        return total;
    }
    /**
     * @return the subTotal
     */
    public double getSubTotal() {
        return subTotal;
    }
    /**
     * @param subTotal the subTotal to set
     */
    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }
    /**
     * @return the ppn
     */
    public double getPpn() {
        return ppn;
    }
    /**
     * @param ppn the ppn to set
     */
    public void setPpn(double ppn) {
        this.ppn = ppn;
    }
    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }
    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }
    /**
     * @return the tabel
     */
    public DefaultTableModel getTabel() {
        return tabel;
    }
    /**
     * @param tabel the tabel to set
     */
    public void setTabel(DefaultTableModel tabel) {
        this.tabel = tabel;
    }
    public double countDiskon(){
      diskon=total*0.05;
      return diskon;
    }
    public double getDiskon() {
      return diskon;
    }
}
