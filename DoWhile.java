/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgdo.pkgwhile;

/**
 *
 * @author MOKLET-1
 */
public class DoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //   do{
     //      aksi
     //   }while(kondisi);
        
        int a = 0;
        boolean kondisi = true;
        
        do{
            a++;
            System.out.println("Neilsya ke-" + a);
            
            if(a==10){
                kondisi = false;
            }
        } while (kondisi);
    }
    
}
