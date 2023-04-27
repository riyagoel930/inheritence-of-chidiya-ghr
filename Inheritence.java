package side;

 class ChidiyaGhar
 {
	void animals() 
	{
		System.out.println("Family of animals");
	}
 }
	class Panda extends ChidiyaGhar
	{
		void animals()
		{
			System.out.println("Panda==Happiness");
		}
	}
		class Teddy extends ChidiyaGhar
		{
			void animals() 
			{
				System.out.println("Teddy==Politeness");
				
			}
		}	
			class Rabbit extends ChidiyaGhar
			{
				void animals() 
				{
					System.out.println("Rabbit==Sincerity");
				}
			}
				class Bear extends ChidiyaGhar
				{
					void animals() 
					{
						System.out.println("Bear==Generousity");
					}
				}
public class Shapes
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ChidiyaGhar c1,c2,c3,c4;
		c1=new Panda();
		c2=new Teddy();
		c3=new Rabbit();
		c4=new Bear();
		c1.animals();
		c2.animals();
		c3.animals();
		c4.animals();
	}
 
}		
		
	
 
 
		
		
