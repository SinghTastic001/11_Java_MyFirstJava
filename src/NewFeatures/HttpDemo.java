//package NewFeatures;
//
//import java.net.URI;
//import java.net.URISyntaxException;1
//import java.net.http.HttpClient;
//import java.net.http.HttpRequest;
//import java.net.http.HttpResponse;
//
//public class HttpDemo {
//	
//	public static void main(String[] args) throws URISyntaxException {
//		
//		HttpClient client = HttpClient.newBuilder().build();
//		
//		HttpRequest request = HttpRequest
//				.newBuilder()
//				.uri(new URI("https://catfact.ninja/fact"))
//				.GET()
//				.build();
//		
//		HttpResponse response = client.send(request,HttpResponse.BodyHandlers.ofString());
//		
//		System.out.println(response.body());
//		
//		
//	}
//
//}
