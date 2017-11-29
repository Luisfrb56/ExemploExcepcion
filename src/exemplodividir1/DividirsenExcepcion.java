
package exemplodividir1;


public class DividirsenExcepcion {
    private int numerador;
    private int denominador;
    public DividirsenExcepcion(int numerador,int denominador) {
        this.numerador=numerador;
        this.denominador=denominador;
               
    }
   public void DividirsenExcepcion(){
       try{
       int resposta=numerador/denominador;
       System.out.println("************* \n"+numerador+" / "+denominador+" = "+resposta);
       }catch(Exception dse){
           System.out.println("Non se pode dividir entre 0");
       }finally{
       int resposta=numerador+denominador;
       System.out.println("suma= "+resposta+"\n************* \n");
   }
   }
}
