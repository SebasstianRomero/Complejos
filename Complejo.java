import java.util.Scanner;

public class Complejo {
  private float real;
  private float imag;
  
  public Complejo suma(Complejo c1){
  Complejo res=new Complejo();
  res.real=this.real+c1.real;
  res.imag=this.imag+c1.imag;
  return res;
  }
  public Complejo resta(Complejo c1){
  Complejo res=new Complejo();
  res.real=this.real-c1.real;
  res.imag=this.imag-c1.imag;
  return res; 
  }
  public Complejo mult(Complejo c1){
  Complejo res=new Complejo();
  res.real=(this.real*c1.real)-(this.imag*c1.imag);
  res.imag=(this.real*c1.imag)+(this.imag*c1.real);
  return res;
  }

  public Complejo conjugado(){
  Complejo res=new Complejo();
  res.real=this.real;
  res.imag=this.imag*-1;
  return res;
  }

  public Complejo division(Complejo c1){
    Complejo numerador,denominador,res=new Complejo();
    numerador=this.mult(c1.conjugado());
    denominador=c1.mult(c1.conjugado());
    res.real=numerador.real/denominador.real;
    res.imag=numerador.imag/denominador.real;
  return res;
  } 
  public Complejo modulo(Complejo c1){
    Complejo res=new Complejo();
    res.real=(float)Math.sqrt(this.real*this.real +       this.imag*this.imag);
  return res;
  }
  public void setReal(float real){
    this.real=real;
  }

  public float getReal(){
    return this.real;
  }
  public void leer(){
    System.out.print("introduzca 2 numeros espaciados(real+imag):");
    Scanner s=new Scanner(System.in);
    try
    {
      Complejo c=new Complejo();
      this.real=s.nextFloat();
      this.imag=s.nextFloat();
    }
    catch(InputMismatchException ex)
    {
      System.out.println("\n(Ingrese un número, en este momento se asigna o)");
      this.real=0;
      this.imag=0;
    }
  }
  public void imprimir(){
    if(real==0){
      if(imag==0){
        System.out.println(0);
    }else{
     System.out.println(imag+"i");
    }
  }else if(imag==0){
    System.out.println(real);
  }else if(imag<0){
    System.out.println(real+""+imag+"i");
  }else{
   System.out.println(real+"+"+imag+"i");
    }
  }
}
