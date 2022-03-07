package Factory.Button;

public class WindowsButton implements Button {

    @Override
    public void render() {
        System.out.println("Rendered WindowsButton");
    }

    @Override
    public void onClick() {
        System.out.println("WindowsButton clicked");
    }
    
}
