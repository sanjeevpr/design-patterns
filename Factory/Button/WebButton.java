package Factory.Button;

public class WebButton implements Button {

    @Override
    public void render() {
        System.out.println("Rendered WebButton");
        
    }

    @Override
    public void onClick() {
        System.out.println("WebButton clicked");
        
    }
    
}
