package testjni.preqel.com.testdagger;

import javax.inject.Inject;

/**
 * Created by preqel on 2018/3/30.
 */

public class Factory {
    Person person;
    @Inject
    public Factory(Person person){
        this.person = person;
    }
}
