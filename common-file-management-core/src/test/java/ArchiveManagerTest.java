import org.prometheus_core.service.file_manager.model.archive.TimeUnit;
import org.prometheus_core.service.file_manager.model.endpoint.Credential;

import java.util.ArrayList;
import java.util.List;

public class ArchiveManagerTest {


    public void storeArchiveRecord(){
        final Credential aaaa = Credential
                .builder()
                .domain("aaaa")
                .userName("adfaf")
                .password("your computer password")
                .build();
    }



    public void some(){
        List<Object> source = new ArrayList<>();
        source.add("String");
        source.add(TimeUnit.MONTH);

        StringBuilder sb = new StringBuilder();

        for (Object object: source){
            if (object instanceof String){
                sb.append(object).append("/");
            } else if (object instanceof TimeUnit){

            }
        }



    }
}
