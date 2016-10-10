package hu.icell.dockertest.di;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import hu.icell.dockertest.DockerApplication;

/**
 * Created by User on 2016. 10. 10..
 */
@Module
public class AppModule {

    DockerApplication application;

    public AppModule(DockerApplication application) {
        this.application = application;
    }

    @Provides
    @Singleton
    public DockerApplication getApplication(){
        return application;
    }


}
