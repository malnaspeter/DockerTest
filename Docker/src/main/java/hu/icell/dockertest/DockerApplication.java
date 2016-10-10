package hu.icell.dockertest;

import android.app.Application;

import hu.icell.dockertest.di.AppModule;
import hu.icell.dockertest.di.DaggerDockerComponent;
import hu.icell.dockertest.di.DockerComponent;
import hu.icell.dockertest.di.DockerModul;

/**
 * Created by User on 2016. 10. 10..
 */

public class DockerApplication extends Application {

    AppModule appModule;
    DockerModul dockerModul;
    DockerComponent componenet;

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public DockerComponent getComponenet() {
        if (componenet == null) {
            componenet = DaggerDockerComponent.builder()
                    .appModule(getAppModule())
                    .dockerModul(getDockerModul())
                    .build();
        }
        return componenet;
    }

    public AppModule getAppModule() {
        if (appModule == null) {
            appModule = new AppModule(this);
        }
        return appModule;
    }

    public DockerModul getDockerModul() {
        if (dockerModul == null) {
            dockerModul = new DockerModul();
        }
        return dockerModul;
    }
}
