public class Automate1D {
  public static boolean[] front = {};
  public static boolean[] back  = {};
  public static   boolean[] rule102 = {false, true, true, false, false, true, true, false};
  public static char black = '█';
  public static char white = ' ';

  // Écrivez vos fonctions ici
    public static void init (int n){
	front=new boolean[n];
	back=new boolean[n];
	front[n/2]=true;
	back[n/2]=true;
    }
    public static void swap(){
	boolean[] aux= front;
	front=back;
	back=aux;
    }

    public static void print(){
	for (int i=0;i<front.length; i++){
	    if (front[i]) {
		System.out.print(black);
	    }else{
		System.out.print(white);
	    }
	}
	System.out.println();
    }

    public static int computeIndex(boolean b1,boolean b2, boolean b3){
	int n1=0,n2=0,n3=0;
	if (b1) {n1=1;}
	if (b2) {n2=1;}
	if (b3) {n3=1;}
	return 4*n1+2*n2+n3;
    }

    public static void step (boolean[] rule){
	for (int i=0; i<back.length; i++){
	    boolean b1=false;
	    boolean b2=front[i];
	    boolean b3=false;
	    if (i>0) {b1=front[i-1];}
	    if (i<back.length-1) {b3=front[i+1];}
	    back[i]=rule[computeIndex(b1,b2,b3)];
	}
    }

    public static void run(int step, int size, boolean[] rule){
	init(size);
	for (int i=0; i<step; i++) {
	    print();
	    step(rule);
	    swap();
	}
    }

  
    public static void main(String[] args) {
	run(32,64,rule102);
    
  }
}
