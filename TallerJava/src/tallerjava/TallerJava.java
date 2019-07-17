
package tallerjava;


public class TallerJava {
/**
 *
 * @author Cristopher Duarte,Aylyn Meza
     * @param args
 */

    public static void main(String[] args) {
        motos mt;
        CarroTurismo ct;
        CarroDeportivo cd;
        Carro4x4 c4;
        Monovolumenes mn;
        Furgonetas fg;
        
        mt=new motos("Zusuki","sxcd29","ACPM",3000,201364121);
        System.out.println(mt.mostrar());
        ct=new CarroTurismo("Zusuki","sxcd29","ACPM",3000,201364121,"aceite","acpm",4);
        System.out.println(ct.mostrarInfo1());
        cd=new CarroDeportivo("Zusuki","sxcd29","ACPM",3000,201364121,"20 cab",4,2,true);
        System.out.println(cd.mostrarInfo2());
        c4=new Carro4x4("Zusuki","sxcd29","ACPM",3000,201364121,"aceite",4);
        System.out.println(c4.mostrarInfo3());
        mn=new Monovolumenes("Zusuki","sxcd29","ACPM",3000,201364121,4,8,1000,"aceite",true);
        System.out.println(mn.mostrarInfo4());
        fg=new Furgonetas("Zusuki","sxcd29","ACPM",3000,201364121,1500,"150 pies");
        System.out.println(fg.mostrarInfo5());
        
        
        
        
      
    }
    
}
