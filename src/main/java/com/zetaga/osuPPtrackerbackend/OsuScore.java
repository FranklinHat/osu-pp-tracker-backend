package com.zetaga.osuPPtrackerbackend;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data

public class OsuScore {

    @JsonProperty("beatmap_id")
    private int beatMapID;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("accuracy")
    private double accuracy;
    @JsonProperty("id")
    private int id;
    @JsonProperty("max_combo")
    private int maxCombo;
    @JsonProperty("passed")
    private boolean passed;
    @JsonProperty("pp")
    private double pp;
    @JsonProperty("score_statistics")
    private ScoreStatistics scoreStatistics;
    @JsonProperty("mods")
    private List<String> modList = new ArrayList<>();


}
