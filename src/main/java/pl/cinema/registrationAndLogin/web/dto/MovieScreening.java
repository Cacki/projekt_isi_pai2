package pl.cinema.registrationAndLogin.web.dto;


import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class MovieScreening {
    private Integer id;
    private Date screeningDate;
    private Integer movieId;
    private String movieTitle;
    private Integer auditoriumId;

    @Override
    public String toString() {
        return "MovieScreening{" +
                "id=" + id +
                ", screeningDate=" + screeningDate +
                ", movieId=" + movieId +
                ", movieTitle='" + movieTitle + '\'' +
                ", auditoriumId=" + auditoriumId +
                '}';
    }



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
    public Integer getMovieId() {
        return movieId;
    }
    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    @Basic
    @Column(name = "title")
    public String getMovieTitle() {
        return movieTitle;
    }
    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    @Basic
    @Column(name = "auditorium_id")
    public Integer getAuditoriumId() {
        return auditoriumId;
    }
    public void setAuditoriumId(Integer auditoriumId) {
        this.auditoriumId = auditoriumId;
    }



}
