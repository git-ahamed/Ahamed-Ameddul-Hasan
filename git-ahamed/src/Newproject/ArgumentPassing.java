package Newproject;

public class ArgumentPassing {
	public static void main(String[] args) {
		Pen lax=new Pen();
	PBV pbv=new PBV();
	
	System.out.println("The size of the pen before change:" +lax.size);
	pbv.hasan(lax.size);
	System.out.println("The size of the pen after giving:"+lax.size);
	PBR pbr=new PBR();
	System.out.println("The Reference size of the pen before change:"+lax.size);
	
	pbr.hasan(lax);
	System.out.println("The Reference size of the pen after changes:"+lax.size);
	}
}

class Pen{
	int size=5;
	}
	class PBV{
		public void hasan(int size) {
			size=10;
			
		}
	}
	class PBR{
			public void hasan(Pen refile) {
				refile.size=20;
			}
		}
	

