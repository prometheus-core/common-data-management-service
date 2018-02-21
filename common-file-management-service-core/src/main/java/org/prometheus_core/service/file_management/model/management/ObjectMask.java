package org.prometheus_core.service.file_management.model.management;

import java.util.ArrayList;
import java.util.List;

/**
 * Class for file matching within sources/targets.
 *
 * Could be also used to detect what files do not match.
 */
public class ObjectMask {




    public enum CustomMask{
        YY("",""){
        public List<String> getAllMembers() {
            List<String> members = new ArrayList<>();
            for (int i =0;i<100;i++){
                if (i < 10){
                    members.add("0" + i);
                } else {
                    members.add(Integer.toString(i));
                }
            }
            return members;
        }
        },
        YYYY("",""){
            public List<String> getAllMembers() {
                List<String> members = new ArrayList<>();
                for (int i =2010;i<2200;i++){
                        members.add(Integer.toString(i));
                    }

                return members;
            }
        },
        MM("",""){
            public List<String> getAllMembers() {
                List<String> members = new ArrayList<>();
                for (int i =0;i<13;i++){
                    if (i < 10){
                        members.add("0" + i);
                    } else {
                        members.add(Integer.toString(i));
                    }
                }
                return members;
            }
        },
        DD("",""){
            public List<String> getAllMembers() {
                List<String> members = new ArrayList<>();
                for (int i =0;i<32;i++){
                    if (i < 10){
                        members.add("0" + i);
                    } else {
                        members.add(Integer.toString(i));
                    }
                }
                return members;
            }
        };

        private String name;
        private String description;

        private Object objectSet;

        CustomMask(String name, String description){
            this.name = name;
            this.description = description;
        }


       public abstract List<String> getAllMembers();



    }
}
