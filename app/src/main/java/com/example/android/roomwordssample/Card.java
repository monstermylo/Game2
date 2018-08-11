package com.example.android.roomwordssample;

import android.arch.persistence.room.ColumnInfo;

public class Card {
    @ColumnInfo(name = "cardName")
    private String cardName;
    @ColumnInfo(name = "strength")
    private Integer strength;
    @ColumnInfo(name = "combat")
    private Integer combat;
    @ColumnInfo(name = "intelligence")
    private Integer intelligence;
    @ColumnInfo(name = "resilience")
    private Integer resilience;
    @ColumnInfo(name = "power")
    private Integer power;
    @ColumnInfo(name = "magic")
    private Integer magic;
    @ColumnInfo(name = "cardType")
    private String cardType;
    @ColumnInfo(name = "team")
    private String team;
    @ColumnInfo(name = "race")
    private String race;
    @ColumnInfo(name = "rank")
    private Integer rank;
    @ColumnInfo(name = "level")
    private Integer level;
    @ColumnInfo(name = "owned")
    private Boolean owned;
    @ColumnInfo(name = "desc")
    private String desc;
    @ColumnInfo(name = "exp")
    private Integer exp;
    @ColumnInfo(name = "pieces")
    private Integer pieces;
    

    public Integer getExp() {
        return exp;
    }

    public void setExp(Integer exp) {
        this.exp = exp;
    }

    public Integer getPieces() {
        return pieces;
    }

    public void setPieces(Integer pieces) {
        this.pieces = pieces;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public Integer getCombat() {
        return combat;
    }

    public void setCombat(Integer combat) {
        this.combat = combat;
    }

    public Integer getintelligence() {
        return intelligence;
    }

    public void setintelligence(Integer intelligence) {
        this.intelligence = intelligence;
    }

    public Integer getResilience() {
        return resilience;
    }

    public void setResilience(Integer resilience) {
        this.resilience = resilience;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getMagic() {
        return magic;
    }

    public void setMagic(Integer magic) {
        this.magic = magic;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardtype) {
        this.cardType = cardtype;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public void obtainCard(){
        this.owned = true;
    }
    
    public void removeCard(){
        this.owned = false;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    
    public void levelUp(){
        this.level = this.level + 1;
    }
    
    public void rankUp(){
        this.rank = this.rank + 1;
    }
}
