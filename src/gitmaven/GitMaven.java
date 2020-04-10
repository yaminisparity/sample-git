package gitmaven;

public class GitMaven {
	 int a=30;
     double c=3.5;
     double d;
     public void method1()
     {
    	 d=a*c;
    	 System.out.println(d);
    	 System.out.println("method completed");
    	 
     }
	public static void main(String[] args) {
    
		GitMaven n=new GitMaven();
		n.method1();
	}

}
