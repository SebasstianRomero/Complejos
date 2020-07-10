class Main{
public static void main (String[] args) {
Complejo c=new Complejo();
Complejo c1=new Complejo();
Complejo res=new Complejo();
c.leer();
c1.leer();
res=c.suma(c1);
System.out.print("Suma: ");
res.imprimir();
res=c.resta(c1);System.out.print("Resta: ");
res.imprimir();
res=c.mult(c1);
System.out.print("Multiplicacion: ");
res.imprimir();
res=c.division(c1);
System.out.print("Division: ");
res.imprimir();
res=c.conjugado();
System.out.print("Conjugado1: ");
res.imprimir();
res=c1.conjugado();
System.out.print("Conjugado2: ");
res.imprimir();
System.out.print("Modulo : ");
res=c.modulo(c1);
res.imprimir();
System.out.print("Modulo : ");
res=c1.modulo(c1);
res.imprimir();
}
}