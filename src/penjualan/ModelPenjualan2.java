/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualan;

public class ModelPenjualan2 extends ModelPenjualan {
    private double ppn=0;
    private double total=0;
    private double diskon=0;
    
    @Override //ppn untuk yang internasional sedikit mahal
    public double countPPN(){
        super.countPPN();
        ppn=countSubtotal()*0.3;
        return ppn;
    }
    @Override
    public double countTotal(){
       super.countTotal();
       total=countSubtotal()+ppn-diskon;
       return total;
    }
    @Override
    public void setPpn(double ppn) {
        this.ppn = ppn;
        super.setPpn(ppn);
    }
    @Override
     public double getPpn() {
        return super.getPpn();
    }
}
