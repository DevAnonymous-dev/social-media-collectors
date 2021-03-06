package sm.collector.entity;

import java.util.Objects;

public abstract class Content {

    public enum Type {
      //TWITTER, FLICKR, GOOGLE_PLUS, LINKEDIN,  FACEBOOK, YOUTUBE
      YOUTUBE,FACEBOOK,TWITTER,GOOGLE_PLUS,FLICKR
    }

    public final Type type;
    public  String id ;

    public Content(Type type , String id) {
        this.type = type;
        this.id = id;
    }
    public Content(Type type ) {
        this.type = type;

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Content content = (Content) o;
        return type == content.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }
}
