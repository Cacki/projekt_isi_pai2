package pl.cinema.registrationAndLogin.web.dto;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "screening", schema = "theater", catalog = "")
public class ScreeningEntity {
    private Integer id;
    private Date screeningDate;
    private String movieId;
    private Integer auditoriumId;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "screening_date")
    public Date getScreeningDate() {
        return screeningDate;
    }

    public void setScreeningDate(Date screeningDate) {
        this.screeningDate = screeningDate;
    }

    @Basic
    @Column(name = "movie_id")
    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    @Basic
    @Column(name = "auditorium_id")
    public Integer getAuditoriumId() {
        return auditoriumId;
    }

    public void setAuditoriumId(Integer auditoriumId) {
        this.auditoriumId = auditoriumId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ScreeningEntity that = (ScreeningEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (screeningDate != null ? !screeningDate.equals(that.screeningDate) : that.screeningDate != null)
            return false;
        if (movieId != null ? !movieId.equals(that.movieId) : that.movieId != null) return false;
        if (auditoriumId != null ? !auditoriumId.equals(that.auditoriumId) : that.auditoriumId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (screeningDate != null ? screeningDate.hashCode() : 0);
        result = 31 * result + (movieId != null ? movieId.hashCode() : 0);
        result = 31 * result + (auditoriumId != null ? auditoriumId.hashCode() : 0);
        return result;
    }

   @Override
    public String toString(){
        return id + " " + screeningDate + " " + movieId + " " + auditoriumId;
    }

}
