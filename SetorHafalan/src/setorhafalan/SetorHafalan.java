/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setorhafalan;

/**
 *
 * @author xatalie
 */
public class SetorHafalan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Loading s = new Loading();
                s.setVisible(true);
                try{
                    for(int i=0; i<101; i++){
                        Thread.sleep(70);
                        s.loadingnum.setText(Integer.toString(i)+"%");
                        s.loadingbar.setValue(i);
                        if(i==100){
                            s.setVisible(false);
                            new Login().setVisible(true);
                        }
                    }
                }catch(Exception e){
                    
                }
    }
    
}
