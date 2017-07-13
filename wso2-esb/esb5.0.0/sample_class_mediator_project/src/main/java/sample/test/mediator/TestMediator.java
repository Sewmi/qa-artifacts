package sample.test.mediator;

import org.apache.synapse.mediators.AbstractMediator;

/**
 * Created by sewmini on 7/13/17.
 */

import org.apache.synapse.MessageContext;
import org.apache.synapse.mediators.AbstractMediator;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.xml.namespace.QName;

public class TestMediator extends AbstractMediator {


    private static final Log log = LogFactory.getLog(TestMediator.class);

    private String variable1="10";

    private String variable2="10";

    private int variable3=0;

    public TestMediator(){}

    public boolean mediate(MessageContext mc) {
        mc.setProperty("TestMediatorValue","### set in the class mediator ###");
        return true;
    }

    public String getType() {
        return null;
    }

    public void setTraceState(int traceState) {
        traceState = 0;
    }

    public int getTraceState() {
        return 0;
    }

    public void setVariable1(String newValue) {
        variable1=newValue;
    }

    public String getVariable1() {
        return variable1;
    }

    public void setVariable2(String newValue){
        variable2=newValue;
    }

    public String getVariable2(){
        return variable2;
    }
}