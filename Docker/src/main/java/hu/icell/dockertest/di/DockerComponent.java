package hu.icell.dockertest.di;

import javax.inject.Singleton;

import dagger.Component;
import hu.icell.dockertest.MainActivity;

/**
 * Created by User on 2016. 10. 10..
 */

@Singleton
@Component(modules = {AppModule.class, DockerModul.class})
public interface DockerComponent {

    void inject(MainActivity activity);

}
