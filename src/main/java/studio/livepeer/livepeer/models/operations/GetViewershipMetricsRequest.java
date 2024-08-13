/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import studio.livepeer.livepeer.utils.SpeakeasyMetadata;
import studio.livepeer.livepeer.utils.Utils;


public class GetViewershipMetricsRequest {

    /**
     * The playback ID to filter the query results. This can be a canonical
     * playback ID from Livepeer assets or streams, or dStorage identifiers
     * for assets
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=playbackId")
    private Optional<String> playbackId;

    /**
     * Start timestamp for the query range (inclusive)
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=from")
    private Optional<? extends From> from;

    /**
     * End timestamp for the query range (exclusive)
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=to")
    private Optional<? extends To> to;

    /**
     * The time step to aggregate viewership metrics by
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=timeStep")
    private Optional<? extends TimeStep> timeStep;

    /**
     * The asset ID to filter metrics for
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=assetId")
    private Optional<String> assetId;

    /**
     * The stream ID to filter metrics for
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=streamId")
    private Optional<String> streamId;

    /**
     * The creator ID to filter the query results
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=creatorId")
    private Optional<String> creatorId;

    /**
     * The list of fields to break down the query results. Specify this
     * query-string multiple times to break down by multiple fields.
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=breakdownBy[]")
    private Optional<? extends List<QueryParamBreakdownBy>> breakdownBy;

    @JsonCreator
    public GetViewershipMetricsRequest(
            Optional<String> playbackId,
            Optional<? extends From> from,
            Optional<? extends To> to,
            Optional<? extends TimeStep> timeStep,
            Optional<String> assetId,
            Optional<String> streamId,
            Optional<String> creatorId,
            Optional<? extends List<QueryParamBreakdownBy>> breakdownBy) {
        Utils.checkNotNull(playbackId, "playbackId");
        Utils.checkNotNull(from, "from");
        Utils.checkNotNull(to, "to");
        Utils.checkNotNull(timeStep, "timeStep");
        Utils.checkNotNull(assetId, "assetId");
        Utils.checkNotNull(streamId, "streamId");
        Utils.checkNotNull(creatorId, "creatorId");
        Utils.checkNotNull(breakdownBy, "breakdownBy");
        this.playbackId = playbackId;
        this.from = from;
        this.to = to;
        this.timeStep = timeStep;
        this.assetId = assetId;
        this.streamId = streamId;
        this.creatorId = creatorId;
        this.breakdownBy = breakdownBy;
    }
    
    public GetViewershipMetricsRequest() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The playback ID to filter the query results. This can be a canonical
     * playback ID from Livepeer assets or streams, or dStorage identifiers
     * for assets
     * 
     */
    @JsonIgnore
    public Optional<String> playbackId() {
        return playbackId;
    }

    /**
     * Start timestamp for the query range (inclusive)
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<From> from() {
        return (Optional<From>) from;
    }

    /**
     * End timestamp for the query range (exclusive)
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<To> to() {
        return (Optional<To>) to;
    }

    /**
     * The time step to aggregate viewership metrics by
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<TimeStep> timeStep() {
        return (Optional<TimeStep>) timeStep;
    }

    /**
     * The asset ID to filter metrics for
     */
    @JsonIgnore
    public Optional<String> assetId() {
        return assetId;
    }

    /**
     * The stream ID to filter metrics for
     */
    @JsonIgnore
    public Optional<String> streamId() {
        return streamId;
    }

    /**
     * The creator ID to filter the query results
     */
    @JsonIgnore
    public Optional<String> creatorId() {
        return creatorId;
    }

    /**
     * The list of fields to break down the query results. Specify this
     * query-string multiple times to break down by multiple fields.
     * 
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<QueryParamBreakdownBy>> breakdownBy() {
        return (Optional<List<QueryParamBreakdownBy>>) breakdownBy;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The playback ID to filter the query results. This can be a canonical
     * playback ID from Livepeer assets or streams, or dStorage identifiers
     * for assets
     * 
     */
    public GetViewershipMetricsRequest withPlaybackId(String playbackId) {
        Utils.checkNotNull(playbackId, "playbackId");
        this.playbackId = Optional.ofNullable(playbackId);
        return this;
    }

    /**
     * The playback ID to filter the query results. This can be a canonical
     * playback ID from Livepeer assets or streams, or dStorage identifiers
     * for assets
     * 
     */
    public GetViewershipMetricsRequest withPlaybackId(Optional<String> playbackId) {
        Utils.checkNotNull(playbackId, "playbackId");
        this.playbackId = playbackId;
        return this;
    }

    /**
     * Start timestamp for the query range (inclusive)
     */
    public GetViewershipMetricsRequest withFrom(From from) {
        Utils.checkNotNull(from, "from");
        this.from = Optional.ofNullable(from);
        return this;
    }

    /**
     * Start timestamp for the query range (inclusive)
     */
    public GetViewershipMetricsRequest withFrom(Optional<? extends From> from) {
        Utils.checkNotNull(from, "from");
        this.from = from;
        return this;
    }

    /**
     * End timestamp for the query range (exclusive)
     */
    public GetViewershipMetricsRequest withTo(To to) {
        Utils.checkNotNull(to, "to");
        this.to = Optional.ofNullable(to);
        return this;
    }

    /**
     * End timestamp for the query range (exclusive)
     */
    public GetViewershipMetricsRequest withTo(Optional<? extends To> to) {
        Utils.checkNotNull(to, "to");
        this.to = to;
        return this;
    }

    /**
     * The time step to aggregate viewership metrics by
     */
    public GetViewershipMetricsRequest withTimeStep(TimeStep timeStep) {
        Utils.checkNotNull(timeStep, "timeStep");
        this.timeStep = Optional.ofNullable(timeStep);
        return this;
    }

    /**
     * The time step to aggregate viewership metrics by
     */
    public GetViewershipMetricsRequest withTimeStep(Optional<? extends TimeStep> timeStep) {
        Utils.checkNotNull(timeStep, "timeStep");
        this.timeStep = timeStep;
        return this;
    }

    /**
     * The asset ID to filter metrics for
     */
    public GetViewershipMetricsRequest withAssetId(String assetId) {
        Utils.checkNotNull(assetId, "assetId");
        this.assetId = Optional.ofNullable(assetId);
        return this;
    }

    /**
     * The asset ID to filter metrics for
     */
    public GetViewershipMetricsRequest withAssetId(Optional<String> assetId) {
        Utils.checkNotNull(assetId, "assetId");
        this.assetId = assetId;
        return this;
    }

    /**
     * The stream ID to filter metrics for
     */
    public GetViewershipMetricsRequest withStreamId(String streamId) {
        Utils.checkNotNull(streamId, "streamId");
        this.streamId = Optional.ofNullable(streamId);
        return this;
    }

    /**
     * The stream ID to filter metrics for
     */
    public GetViewershipMetricsRequest withStreamId(Optional<String> streamId) {
        Utils.checkNotNull(streamId, "streamId");
        this.streamId = streamId;
        return this;
    }

    /**
     * The creator ID to filter the query results
     */
    public GetViewershipMetricsRequest withCreatorId(String creatorId) {
        Utils.checkNotNull(creatorId, "creatorId");
        this.creatorId = Optional.ofNullable(creatorId);
        return this;
    }

    /**
     * The creator ID to filter the query results
     */
    public GetViewershipMetricsRequest withCreatorId(Optional<String> creatorId) {
        Utils.checkNotNull(creatorId, "creatorId");
        this.creatorId = creatorId;
        return this;
    }

    /**
     * The list of fields to break down the query results. Specify this
     * query-string multiple times to break down by multiple fields.
     * 
     */
    public GetViewershipMetricsRequest withBreakdownBy(List<QueryParamBreakdownBy> breakdownBy) {
        Utils.checkNotNull(breakdownBy, "breakdownBy");
        this.breakdownBy = Optional.ofNullable(breakdownBy);
        return this;
    }

    /**
     * The list of fields to break down the query results. Specify this
     * query-string multiple times to break down by multiple fields.
     * 
     */
    public GetViewershipMetricsRequest withBreakdownBy(Optional<? extends List<QueryParamBreakdownBy>> breakdownBy) {
        Utils.checkNotNull(breakdownBy, "breakdownBy");
        this.breakdownBy = breakdownBy;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetViewershipMetricsRequest other = (GetViewershipMetricsRequest) o;
        return 
            Objects.deepEquals(this.playbackId, other.playbackId) &&
            Objects.deepEquals(this.from, other.from) &&
            Objects.deepEquals(this.to, other.to) &&
            Objects.deepEquals(this.timeStep, other.timeStep) &&
            Objects.deepEquals(this.assetId, other.assetId) &&
            Objects.deepEquals(this.streamId, other.streamId) &&
            Objects.deepEquals(this.creatorId, other.creatorId) &&
            Objects.deepEquals(this.breakdownBy, other.breakdownBy);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            playbackId,
            from,
            to,
            timeStep,
            assetId,
            streamId,
            creatorId,
            breakdownBy);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetViewershipMetricsRequest.class,
                "playbackId", playbackId,
                "from", from,
                "to", to,
                "timeStep", timeStep,
                "assetId", assetId,
                "streamId", streamId,
                "creatorId", creatorId,
                "breakdownBy", breakdownBy);
    }
    
    public final static class Builder {
 
        private Optional<String> playbackId = Optional.empty();
 
        private Optional<? extends From> from = Optional.empty();
 
        private Optional<? extends To> to = Optional.empty();
 
        private Optional<? extends TimeStep> timeStep = Optional.empty();
 
        private Optional<String> assetId = Optional.empty();
 
        private Optional<String> streamId = Optional.empty();
 
        private Optional<String> creatorId = Optional.empty();
 
        private Optional<? extends List<QueryParamBreakdownBy>> breakdownBy = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The playback ID to filter the query results. This can be a canonical
         * playback ID from Livepeer assets or streams, or dStorage identifiers
         * for assets
         * 
         */
        public Builder playbackId(String playbackId) {
            Utils.checkNotNull(playbackId, "playbackId");
            this.playbackId = Optional.ofNullable(playbackId);
            return this;
        }

        /**
         * The playback ID to filter the query results. This can be a canonical
         * playback ID from Livepeer assets or streams, or dStorage identifiers
         * for assets
         * 
         */
        public Builder playbackId(Optional<String> playbackId) {
            Utils.checkNotNull(playbackId, "playbackId");
            this.playbackId = playbackId;
            return this;
        }

        /**
         * Start timestamp for the query range (inclusive)
         */
        public Builder from(From from) {
            Utils.checkNotNull(from, "from");
            this.from = Optional.ofNullable(from);
            return this;
        }

        /**
         * Start timestamp for the query range (inclusive)
         */
        public Builder from(Optional<? extends From> from) {
            Utils.checkNotNull(from, "from");
            this.from = from;
            return this;
        }

        /**
         * End timestamp for the query range (exclusive)
         */
        public Builder to(To to) {
            Utils.checkNotNull(to, "to");
            this.to = Optional.ofNullable(to);
            return this;
        }

        /**
         * End timestamp for the query range (exclusive)
         */
        public Builder to(Optional<? extends To> to) {
            Utils.checkNotNull(to, "to");
            this.to = to;
            return this;
        }

        /**
         * The time step to aggregate viewership metrics by
         */
        public Builder timeStep(TimeStep timeStep) {
            Utils.checkNotNull(timeStep, "timeStep");
            this.timeStep = Optional.ofNullable(timeStep);
            return this;
        }

        /**
         * The time step to aggregate viewership metrics by
         */
        public Builder timeStep(Optional<? extends TimeStep> timeStep) {
            Utils.checkNotNull(timeStep, "timeStep");
            this.timeStep = timeStep;
            return this;
        }

        /**
         * The asset ID to filter metrics for
         */
        public Builder assetId(String assetId) {
            Utils.checkNotNull(assetId, "assetId");
            this.assetId = Optional.ofNullable(assetId);
            return this;
        }

        /**
         * The asset ID to filter metrics for
         */
        public Builder assetId(Optional<String> assetId) {
            Utils.checkNotNull(assetId, "assetId");
            this.assetId = assetId;
            return this;
        }

        /**
         * The stream ID to filter metrics for
         */
        public Builder streamId(String streamId) {
            Utils.checkNotNull(streamId, "streamId");
            this.streamId = Optional.ofNullable(streamId);
            return this;
        }

        /**
         * The stream ID to filter metrics for
         */
        public Builder streamId(Optional<String> streamId) {
            Utils.checkNotNull(streamId, "streamId");
            this.streamId = streamId;
            return this;
        }

        /**
         * The creator ID to filter the query results
         */
        public Builder creatorId(String creatorId) {
            Utils.checkNotNull(creatorId, "creatorId");
            this.creatorId = Optional.ofNullable(creatorId);
            return this;
        }

        /**
         * The creator ID to filter the query results
         */
        public Builder creatorId(Optional<String> creatorId) {
            Utils.checkNotNull(creatorId, "creatorId");
            this.creatorId = creatorId;
            return this;
        }

        /**
         * The list of fields to break down the query results. Specify this
         * query-string multiple times to break down by multiple fields.
         * 
         */
        public Builder breakdownBy(List<QueryParamBreakdownBy> breakdownBy) {
            Utils.checkNotNull(breakdownBy, "breakdownBy");
            this.breakdownBy = Optional.ofNullable(breakdownBy);
            return this;
        }

        /**
         * The list of fields to break down the query results. Specify this
         * query-string multiple times to break down by multiple fields.
         * 
         */
        public Builder breakdownBy(Optional<? extends List<QueryParamBreakdownBy>> breakdownBy) {
            Utils.checkNotNull(breakdownBy, "breakdownBy");
            this.breakdownBy = breakdownBy;
            return this;
        }
        
        public GetViewershipMetricsRequest build() {
            return new GetViewershipMetricsRequest(
                playbackId,
                from,
                to,
                timeStep,
                assetId,
                streamId,
                creatorId,
                breakdownBy);
        }
    }
}

