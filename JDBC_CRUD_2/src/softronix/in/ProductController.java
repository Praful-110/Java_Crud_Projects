package softronix.in;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import ProductFactory.ServiceFactory;
import ProductService.ProductService;
import softronix.in.entity.Products;

public class ProductController {

	public static void main(String[] args) throws Exception, IOException {
	
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		Integer option;
		Products product = new Products();
		ProductService service= ServiceFactory.getService();
		
		
		while(true)
		{
			System.out.println("***************Perform curd operatons*******************");
			System.out.println("To Insert select 1 : Insert");
			System.out.println("To Search select 2 : Search");
			System.out.println("To Update select 3 : Update");
			System.out.println("To Delete select 4 : Delete");
			System.out.println("To Exit select 5   : Exit");
			System.out.println();
			
			
			
			System.out.print("Please select a Options from [1,2,3,4,5] : ");
			option = Integer.parseInt(br.readLine());
	
			switch (option) 
			{
			case 1:  // Insert
			{  
				System.out.println("------Please Enter the Product Details------");
				
				System.out.print("Enter the Product Id :");
				int productId = Integer.parseInt(br.readLine());
				
				System.out.print("Enter the Product Name :");
				String productName = br.readLine();
				
				System.out.print("Enter the Product Code :");
				String productCode = br.readLine();
				
				System.out.print("Enter the Product Price :");
				float productPrice =Float.parseFloat(br.readLine());
				
				System.out.print("Enter the Product City :");
				String productCity=br.readLine();
				
				
				product.setProductId(productId);
				product.setProductName(productName);
				product.setProductCode(productCode);
				product.setProductPrice(productPrice);
				product.setProductCity(productCity);
				
				
				String productInsert = service.productInsert(product);
				
				if(productInsert != null) {
					System.out.println(productInsert);
				}
				else {
					System.out.println("This Product is not Avilable.....");
				}
				
				
			}
			
			break;
			case 2:// Search
			{
				
				
				System.out.println("------Search Opearations ------");
				
				System.out.print("Enter the Product Id :");
				Integer productId = Integer.parseInt(br.readLine());
				
				Products ps = service.ProductSearch(productId);
				System.out.println();
				System.out.println("Product Id :"+ps.getProductId());
				System.out.println("Product Name :"+ps.getProductName());
				System.out.println("Product Code :"+ps.getProductCode());
				System.out.println("Product Price :"+ps.getProductPrice());
				System.out.println("Product City :"+ps.getProductCity());
				
				System.out.println("------------------------------------------");
				
				
			}
			
			break;
			case 3: // Update
			{
				
				System.out.println("-------------Update Operations---------------");
				
				System.out.print("Enter the Product Id :");
				int Id = Integer.parseInt(br.readLine());
				Products ps = service.ProductSearch(Id);
				
				if(Id==ps.getProductId())
				{
					System.out.println("------Enter the Updated Details-----");
					
					Integer productId = ps.getProductId();
					String productName = ps.getProductName();
					String productCode = ps.getProductCode();
					float productPrice = ps.getProductPrice();
					String productCity = ps.getProductCity();
					
					System.out.print("Enter the Product Name : ");
					String pName = br.readLine();
					productName = pName ;
					
					System.out.print("Enter the Product Code : ");
					String pCode = br.readLine();
					productCode = pCode ;
					
					System.out.print("Enter the Product Price : ");
					float pPrice = Float.parseFloat(br.readLine());
					productPrice=pPrice; 
					
					System.out.print("Enter the Product City : ");
					String pCity = br.readLine();
					productCity = pCity ;
					
					Products pro = new Products();
					
					pro.setProductId(productId);
					pro.setProductName(productName);
					pro.setProductCode(pCode);
					pro.setProductPrice(pPrice);
					pro.setProductCity(productCity);
					
					String productUpdate = service.ProductUpdate(pro);
					System.out.println(productUpdate);
				
					
					
					
				}
				else
				{
					System.out.println("-----------No Product Search--------------");
				}
				
			}
			break;
			
			case 4: // Delete
			{
				
				System.out.println("--------------------------------");
				System.out.println("Enter the Id Delete");
				
				int productId = Integer.parseInt(br.readLine());
				
				Products ps = service.ProductSearch(productId);
				String pd = service.ProductDelete(productId);
				System.out.println(pd);
				
			}
			
			}
			
		}
		
		
	

	}

}
