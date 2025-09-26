package Examples.Builder;

import java.time.LocalDateTime;

public class Post {
    private String title;
    private String text;
    private String category;
    private boolean solo_amigos;
    private LocalDateTime expiracion;


    Post(Builder builder) {
        this.title = builder.title;
        this.text = builder.text;
        this.category = builder.category;
        this.solo_amigos = builder.solo_amigos;
        this.expiracion = builder.expiracion;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isSolo_amigos() {
        return solo_amigos;
    }

    public void setSolo_amigos(boolean solo_amigos) {
        this.solo_amigos = solo_amigos;
    }

    public LocalDateTime getExpiracion() {
        return expiracion;
    }

    public void setExpiracion(LocalDateTime expiracion) {
        this.expiracion = expiracion;
    }

    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", category='" + category + '\'' +
                ", solo_amigos=" + solo_amigos +
                ", expiracion=" + expiracion +
                '}';
    }

    public static class Builder {
        private String title;
        private String text;
        private String category;
        private boolean solo_amigos;
        private LocalDateTime expiracion;


        public Builder title(String title)
        {
            this.title = title;
            return this;
        }

        public Builder text(String text)
        {
            this.text = text;
            return this;
        }

        public Builder category(String category)
        {
            this.category = category;
            return this;
        }

        public Builder solo_amigos(boolean solo_amigos)
        {
            this.solo_amigos = solo_amigos;
            return this;
        }

        public Builder expiracion(LocalDateTime expiracion)
        {
            this.expiracion = expiracion;
            return this;
        }

        public Post build() {
            return new Post(this);
        }
    }

}
