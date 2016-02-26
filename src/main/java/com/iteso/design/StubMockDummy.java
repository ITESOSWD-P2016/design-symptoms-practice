package com.iteso.design;

import javax.xml.ws.Service;

/**
 * Created by Flaveyro´sDell on 25/02/2016.
 */
public class StubMockDummy {
    //STUB CLASS
    public void testActiveWhenCollaboratorIsActive() throws Exception {

        Service service = new SimpleService();
        service.setCollaborator(new StubCollaborator());
        assertTrue(service.isActive());

    }



    class StubCollaborator implements FileRead_test {
        public boolean isActive() {
            return true;
        }
    }

    //MOCKS

    MockControl control = MockControl.createControl(Collaborator.class);
    Collaborator collaborator = (Collaborator) control.getMock();
    control.expectAndReturn(collaborator.isActive(), true);
    control.replay();

    service.setCollaborator(collaborator);
    assertTrue(service.isActive());

    control.verify();

    public class Dummy {

        static {
            throw new IllegalStateException("Do not use this class!");
        }
    }

}
