package Homework.加强班.敖屹04;

import java.util.Objects;

public class Champion {
    private String period;
    private String site;
    private String country;

    public Champion(String period, String site, String country) {
        this.period = period;
        this.site = site;
        this.country = country;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Champion() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Champion champion = (Champion) o;
        return Objects.equals(period, champion.period) &&
                Objects.equals(site, champion.site) &&
                Objects.equals(country, champion.country);
    }

    @Override
    public int hashCode() {

        return Objects.hash(period, site, country);
    }

    @Override
    public String toString() {
        return "获得" + period + site + "世界杯冠军的国家是：" + country;
    }
}
