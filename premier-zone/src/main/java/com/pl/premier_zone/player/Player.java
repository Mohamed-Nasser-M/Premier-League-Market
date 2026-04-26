package com.pl.premier_zone.player;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "player_stats")
public class Player {
    @Id
    @Column(name = "player_name", unique = true)
    private String name;
    @Column(name = "nation")
    private String nation;
    @Column(name = "position")
    private String pos;
    @Column(name = "age")
    private Integer age;
    @Column(name = "matches_played")
    private Integer mp;
    @Column(name = "starts")
    private Integer starts;
    @Column(name = "minutes_played")
    private Double min;
    @Column(name = "goals")
    private Double gls;
    @Column(name = "assists")
    private Double ast;
    @Column(name = "penalties_scored")
    private Double pk;
    @Column(name = "yellow_cards")
    private Double cardy;
    @Column(name = "red_cards")
    private Double cardr;
    @Column(name = "expected_goals")
    private Double xg;
    @Column(name = "expected_assists")
    private Double xag;
    @Column(name = "team_name")
    private String team;

    public Player() {
    }

    public Player(String pos, String name, String nation, Integer age, Integer mp, Integer starts, Double min, Double gls, Double ast, Double pk, Double cardy, Double cardr, Double xg, Double xag, String team) {
        this.pos = pos;
        this.name = name;
        this.nation = nation;
        this.age = age;
        this.mp = mp;
        this.starts = starts;
        this.min = min;
        this.gls = gls;
        this.ast = ast;
        this.pk = pk;
        this.cardy = cardy;
        this.cardr = cardr;
        this.xg = xg;
        this.xag = xag;
        this.team = team;
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getMp() {
        return mp;
    }

    public void setMp(Integer mp) {
        this.mp = mp;
    }

    public Integer getStarts() {
        return starts;
    }

    public void setStarts(Integer starts) {
        this.starts = starts;
    }

    public Double getMin() {
        return min;
    }

    public void setMin(Double min) {
        this.min = min;
    }

    public Double getGls() {
        return gls;
    }

    public void setGls(Double gls) {
        this.gls = gls;
    }

    public Double getAst() {
        return ast;
    }

    public void setAst(Double ast) {
        this.ast = ast;
    }

    public Double getPk() {
        return pk;
    }

    public void setPk(Double pk) {
        this.pk = pk;
    }

    public Double getCardy() {
        return cardy;
    }

    public void setCardy(Double cardy) {
        this.cardy = cardy;
    }

    public Double getCardr() {
        return cardr;
    }

    public void setCardr(Double cardr) {
        this.cardr = cardr;
    }

    public Double getXg() {
        return xg;
    }

    public void setXg(Double xg) {
        this.xg = xg;
    }

    public Double getXag() {
        return xag;
    }

    public void setXag(Double xag) {
        this.xag = xag;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
