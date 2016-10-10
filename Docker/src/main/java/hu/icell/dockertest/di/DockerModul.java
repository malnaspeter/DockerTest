package hu.icell.dockertest.di;

import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;
import hu.icell.dockertest.singleton.TestObj;

/**
 * Created by User on 2016. 10. 10..
 */
@Module
public class DockerModul {

    public DockerModul() {
    }

    @Provides
    @Singleton
    public TestObj getTestObjObj (){
        return new TestObj();
    }



}
