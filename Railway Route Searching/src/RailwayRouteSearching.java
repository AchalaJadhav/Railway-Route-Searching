import java.util.*;

class Route
{
	String source,destination;
	int distance;
	//Route next;
	
	//boolean visited[]=new boolean[50];
	public Route() 
	{
	
		source=" ";
		destination=" ";
		distance=0;
	}
	Route(String s,String d,int des)
	{
		source=s;
		destination=d;
		distance=des;
		//next=null;
	}
	
	
}

class RailwayRoute
{
	int i=12;
	
	/*int cityName[];
	cityName=new int[6];
	citeName[1]= "Pune";
	citeName[2]= "Pune";
	citeName[3]= "Pune";
	citeName[4]= "Pune";
	citeName[5]= "Pune";
	citeName[6]= "Pune";*/
	
	
	//Route cityRoutes[];
	
	//cityRoutes=new Route[10];
	//cityRoutes[0]=new Route();
			
	Route routes[];
	//int matrix[][];

	private static Scanner scanner=new Scanner(System.in);
	void init() throws NullPointerException
	{
		routes=new Route[100];
		for(int i=0;i<routes.length;i++)
			{
			routes[i]=new Route();
			
		routes[0].source="ABC";
		routes[0].destination="XYZ";
		routes[0].distance=10;
		routes[1].source="Pune";
		routes[1].destination="Mumbai";
		routes[1].distance=148;
		routes[2].source="Pune";
		routes[2].destination="Nashik";
		routes[2].distance=211;
		routes[3].source="Pune";
		routes[3].destination="Jalgaon";
		routes[3].distance=389;
		routes[4].source="Pune";
		routes[4].destination="Bhusaval";
		routes[4].distance=395;
		routes[5].source="Pune";
		routes[5].destination="Dhule";
		routes[5].distance=333;

		routes[6].source="Mumbai";
		routes[6].destination="Nashik";
		routes[6].distance=166;
		routes[7].source="Mumbai";
		routes[7].destination="Jalgaon";
		routes[7].distance=412;
		routes[8].source="Mumbai";
		routes[8].destination="Bhusaval";
		routes[8].distance=441;

		routes[9].source="Nashik";
		routes[9].destination="Dhule";
		routes[9].distance=158;
		routes[10].source="Nashik";
		routes[10].destination="Bhusaval";
		routes[10].distance=276;

		routes[11].source="Dhule";
		routes[11].destination="Jalgaon";
		routes[11].distance=91;
		
		routes[12].source="Jalgaon";
		routes[12].destination="Bhusaval";
		routes[12].distance=31;
	}
	
	
		/*cityName[]=
		cityName.add(2,"Mumbai");
		cityName.add(3,"Nashik");
		cityName.add(4,"Jalgaon");
		cityName.add(5,"Dhule");
		cityName.add(6,"Bhusaval");
		matrix=new int[50][50];*/
		
/*		matrix[1][1]=0;
		matrix[1][2]=148;
		matrix[1][3]=211;
		matrix[1][4]=389;
		matrix[1][5]=333;
		matrix[1][6]=395;
		
		matrix[2][1]=148;
		matrix[2][2]=0;
		matrix[2][3]=166;
		matrix[2][4]=412;
		matrix[2][5]=0;
		matrix[2][6]=441;
		
		matrix[3][1]=211;
		matrix[3][2]=166;
		matrix[3][3]=0;
		matrix[3][4]=0;
		matrix[3][5]=158;
		matrix[3][6]=276;
		
		matrix[4][1]=389;
		matrix[4][2]=412;
		matrix[4][3]=0;
		matrix[4][4]=0;
		matrix[4][5]=91;
		matrix[4][6]=31;
		
		matrix[5][1]=333;
		matrix[5][2]=0;
		matrix[5][3]=158;
		matrix[5][4]=91;
		matrix[5][5]=0;
		matrix[5][6]=0;
		
		matrix[6][1]=395;
		matrix[6][2]=441;
		matrix[6][3]=276;
		matrix[6][4]=31;
		matrix[6][5]=0;
		matrix[6][6]=0;
	*/	
	}	
	
	
	void sort()
	{
		Route sortedRoutes[]=new Route[routes.length];
		for(int i=0;i<routes.length;i++)
		{
			sortedRoutes[i]=routes[i];
		}
		//Sorting an Edge List
		Route temp=new Route();
				for(int i=0;i<routes.length;i++)
				{
					for(int j=i+1;j<routes.length;j++)
					{
						if(sortedRoutes[i].distance > sortedRoutes[j].distance)
						{
							if(sortedRoutes[i].source != sortedRoutes[j].source || sortedRoutes[i].destination!=sortedRoutes[j].destination)
							{
								temp.source=sortedRoutes[i].source;
								sortedRoutes[i].source=sortedRoutes[j].source;
								sortedRoutes[j].source=temp.source;
								
								temp.destination=sortedRoutes[i].destination;
								sortedRoutes[i].destination=sortedRoutes[j].destination;
								sortedRoutes[j].destination=temp.destination;
								
								temp.distance=sortedRoutes[i].distance;
								sortedRoutes[i].distance=sortedRoutes[j].distance;
								sortedRoutes[j].distance=temp.distance;
							}
							else
							{
								break;
							}
						}
					}
				}
				
				//Display Sorted Edge-List
				System.out.println("Sorting of edges according to their weight ");
				for(int i=0;i<sortedRoutes.length;i++)
				{
					System.out.println(sortedRoutes[i].source+"->"+sortedRoutes[i].destination+":"+sortedRoutes[i].distance);
				}

	}
	void addRoute()
	{
		System.out.print("Enter Source:");
		String s=scanner.next();
		System.out.print("Enter Destination:");
		String d=scanner.next();
		System.out.print("Enter Distance:");
		int dist=scanner.nextInt();
		Route temp=new Route(s,d,dist);
		routes[i]=temp;
		i++;
	}
	void findMinVertex()
	{
		int max=Integer.MAX_VALUE;
		
	}
	void removeCity()
	{
		
	}
	void removeRoute()
	{
		System.out.print("Enter Source::");
		String s=scanner.next();
		System.out.print("Enter Destination::");
		String d=scanner.next();
		for(int i=0;i<routes.length;i++)
		{
			if(routes[i].source.equals(s)==true && routes[i].destination.equals(d)==true)
			{
				routes[i].source=null;
				routes[i].destination=null;
				routes[i].distance=0;
				break;
			}
		}
		sort();
	}
	void searchRoute()
	{
		int ch;
		do 
		{
			System.out.print("\nMenu\n1.Kruskals\n2.Dijskahtras\n3.Back.\nEnter Choice:");
			ch=scanner.nextInt();
			switch(ch)
			{
			case 1:
			{
			
			}
			break;
			
			case 2:
			{
			}
			break;
			
			case 3:
			{
			}
			break;
			}
		}while(ch!=3);

	}
}


class DijkstraRoute
{
	int pos;
	int pred[]=new int[20];
	ArrayList<String> cityRoute=new ArrayList <String>();
	int Matrix[][];
	boolean visited[]=new boolean[6];
	int dist[]=new int[6];
	
	//dist[0]=0;
	DijkstraRoute()
	{
		cityRoute.add(0,"Pune");
		cityRoute.add(1,"Mumbai");
		cityRoute.add(2,"Nashik");
		cityRoute.add(3,"Jalgaon");
		cityRoute.add(4,"Dhule");
		cityRoute.add(5,"Bhusaval");
		
		Matrix[0][0]=Integer.MAX_VALUE;
		Matrix[0][1]=148;
		Matrix[0][2]=211;
		Matrix[0][3]=389;
		Matrix[0][4]=333;
		Matrix[0][5]=395;
		
		Matrix[1][0]=148;
		Matrix[1][1]=Integer.MAX_VALUE;
		Matrix[1][2]=166;
		Matrix[1][3]=412;
		Matrix[1][4]=Integer.MAX_VALUE;
		Matrix[1][5]=441;
	
		Matrix[2][0]=211;
		Matrix[2][1]=166;
		Matrix[2][2]=Integer.MAX_VALUE;
		Matrix[2][3]=Integer.MAX_VALUE;
		Matrix[2][4]=158;
		Matrix[2][5]=276;
	
		Matrix[3][0]=389;
		Matrix[3][1]=412;
		Matrix[3][2]=Integer.MAX_VALUE;
		Matrix[3][3]=Integer.MAX_VALUE;
		Matrix[3][4]=91;
		Matrix[3][5]=31;
	
		Matrix[4][0]=333;
		Matrix[4][1]=Integer.MAX_VALUE;
		Matrix[4][2]=158;
		Matrix[4][3]=91;
		Matrix[4][4]=Integer.MAX_VALUE;
		Matrix[4][5]=Integer.MAX_VALUE;
	
		Matrix[5][0]=395;
		Matrix[5][1]=441;
		Matrix[5][2]=276;
		Matrix[5][3]=31;
		Matrix[5][4]=Integer.MAX_VALUE;
		Matrix[5][5]=Integer.MAX_VALUE;
	
		
	}
	
	int findMinDistance(int[] dist2)
	{
		int min=9999;
		for(int i=0;i<cityRoute.size();i++)
		{
			if(visited[i]==true && dist[i]<min )
			{
				min=dist[i];
				pos=i;
			}
		}
		return pos;
	}
	
	void djikstra(int[][] AdjMatrix)
	{
		int v=AdjMatrix.length;
		for(int i=0;i<v;i++)
		{
			dist[i]=Integer.MAX_VALUE;
		}
		for(int i=0;i<v-1;i++)
		{
			int minVertex=findMinDistance(dist);
			visited[minVertex]=true;
			
			for (int j = 0; j < v; j++)
			{
				if (AdjMatrix[minVertex][j]!=0 && dist[minVertex]!=Integer.MAX_VALUE && visited[j]!=true)
				{
					int newDist=dist[minVertex]+AdjMatrix[minVertex][j];
					if (newDist<dist[j]) 
					{
						dist[j]=newDist;
					}
				}
			}
		}
		
		for(int i=0;i<v;i++)
		{
			System.out.println(i+" "+dist[i]);
		}
		
		/*int i=v;
		while(pred[i]!=source)
		{
			
		}*/
	}
	
}
public class RailwayRouteSearching 
{
	private static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args)
	{
		int choice;
		RailwayRoute rr=new RailwayRoute();
		do 
		{
			System.out.print("\nMenu\n1.Initialize\n2.Sort\n3.Add Route\n4.Remove Route\n5.Exit\nEnter Choice:");
			choice=scanner.nextInt();
			switch(choice)
			{
			case 1:
					rr.init();
					break;
			case 2:
					rr.sort();
					break;
			case 3:
					rr.addRoute();
					break;
			case 4:
					rr.removeRoute();
					break;
			case 5:
					System.out.println("Thankyou");
					break;
					default:System.out.println("Invalid Choice");
			}
		} while (choice!=6);
	}

}
