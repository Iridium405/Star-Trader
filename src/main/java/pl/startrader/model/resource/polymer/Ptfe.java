package pl.startrader.model.resource.polymer;

import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceParam;

public class Ptfe extends Resource {

    private static Ptfe instance;
    private ResourceParam param;


    private Ptfe() {
        this.param = ResourceParam.PTFE;
    }


    public static synchronized Ptfe getInstance() {
        if(instance == null) {
            instance = new Ptfe();
        }

        return instance;
    }


    public ResourceParam getParam() {
        return param;
    }
}
