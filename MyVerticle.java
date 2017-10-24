package vertxTest;

import io.vertx.core.AbstractVerticle;

public class MyVerticle extends AbstractVerticle {

	@Override
    public void start() throws Exception{
        System.out.println("MyVerticle started!");
    }


	@Override
    public void stop() throws Exception {
        System.out.println("MyVerticle stopped!");
    }

	

}
