/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import studio.livepeer.livepeer.utils.Utils;

/**
 * UsageMetric - An individual metric about usage of a user.
 * 
 */

public class UsageMetric {

    /**
     * The user ID associated with the metric
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("UserID")
    private Optional<String> userID;

    /**
     * The creator ID associated with the metric
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("CreatorID")
    private Optional<String> creatorID;

    /**
     * Total minutes of delivery usage.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("DeliveryUsageMins")
    private Optional<Double> deliveryUsageMins;

    /**
     * Total transcoded minutes.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("TotalUsageMins")
    private Optional<Double> totalUsageMins;

    /**
     * Total minutes of storage usage.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("StorageUsageMins")
    private Optional<Double> storageUsageMins;

    @JsonCreator
    public UsageMetric(
            @JsonProperty("UserID") Optional<String> userID,
            @JsonProperty("CreatorID") Optional<String> creatorID,
            @JsonProperty("DeliveryUsageMins") Optional<Double> deliveryUsageMins,
            @JsonProperty("TotalUsageMins") Optional<Double> totalUsageMins,
            @JsonProperty("StorageUsageMins") Optional<Double> storageUsageMins) {
        Utils.checkNotNull(userID, "userID");
        Utils.checkNotNull(creatorID, "creatorID");
        Utils.checkNotNull(deliveryUsageMins, "deliveryUsageMins");
        Utils.checkNotNull(totalUsageMins, "totalUsageMins");
        Utils.checkNotNull(storageUsageMins, "storageUsageMins");
        this.userID = userID;
        this.creatorID = creatorID;
        this.deliveryUsageMins = deliveryUsageMins;
        this.totalUsageMins = totalUsageMins;
        this.storageUsageMins = storageUsageMins;
    }
    
    public UsageMetric() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The user ID associated with the metric
     */
    @JsonIgnore
    public Optional<String> userID() {
        return userID;
    }

    /**
     * The creator ID associated with the metric
     */
    @JsonIgnore
    public Optional<String> creatorID() {
        return creatorID;
    }

    /**
     * Total minutes of delivery usage.
     */
    @JsonIgnore
    public Optional<Double> deliveryUsageMins() {
        return deliveryUsageMins;
    }

    /**
     * Total transcoded minutes.
     */
    @JsonIgnore
    public Optional<Double> totalUsageMins() {
        return totalUsageMins;
    }

    /**
     * Total minutes of storage usage.
     */
    @JsonIgnore
    public Optional<Double> storageUsageMins() {
        return storageUsageMins;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The user ID associated with the metric
     */
    public UsageMetric withUserID(String userID) {
        Utils.checkNotNull(userID, "userID");
        this.userID = Optional.ofNullable(userID);
        return this;
    }

    /**
     * The user ID associated with the metric
     */
    public UsageMetric withUserID(Optional<String> userID) {
        Utils.checkNotNull(userID, "userID");
        this.userID = userID;
        return this;
    }

    /**
     * The creator ID associated with the metric
     */
    public UsageMetric withCreatorID(String creatorID) {
        Utils.checkNotNull(creatorID, "creatorID");
        this.creatorID = Optional.ofNullable(creatorID);
        return this;
    }

    /**
     * The creator ID associated with the metric
     */
    public UsageMetric withCreatorID(Optional<String> creatorID) {
        Utils.checkNotNull(creatorID, "creatorID");
        this.creatorID = creatorID;
        return this;
    }

    /**
     * Total minutes of delivery usage.
     */
    public UsageMetric withDeliveryUsageMins(double deliveryUsageMins) {
        Utils.checkNotNull(deliveryUsageMins, "deliveryUsageMins");
        this.deliveryUsageMins = Optional.ofNullable(deliveryUsageMins);
        return this;
    }

    /**
     * Total minutes of delivery usage.
     */
    public UsageMetric withDeliveryUsageMins(Optional<Double> deliveryUsageMins) {
        Utils.checkNotNull(deliveryUsageMins, "deliveryUsageMins");
        this.deliveryUsageMins = deliveryUsageMins;
        return this;
    }

    /**
     * Total transcoded minutes.
     */
    public UsageMetric withTotalUsageMins(double totalUsageMins) {
        Utils.checkNotNull(totalUsageMins, "totalUsageMins");
        this.totalUsageMins = Optional.ofNullable(totalUsageMins);
        return this;
    }

    /**
     * Total transcoded minutes.
     */
    public UsageMetric withTotalUsageMins(Optional<Double> totalUsageMins) {
        Utils.checkNotNull(totalUsageMins, "totalUsageMins");
        this.totalUsageMins = totalUsageMins;
        return this;
    }

    /**
     * Total minutes of storage usage.
     */
    public UsageMetric withStorageUsageMins(double storageUsageMins) {
        Utils.checkNotNull(storageUsageMins, "storageUsageMins");
        this.storageUsageMins = Optional.ofNullable(storageUsageMins);
        return this;
    }

    /**
     * Total minutes of storage usage.
     */
    public UsageMetric withStorageUsageMins(Optional<Double> storageUsageMins) {
        Utils.checkNotNull(storageUsageMins, "storageUsageMins");
        this.storageUsageMins = storageUsageMins;
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
        UsageMetric other = (UsageMetric) o;
        return 
            Objects.deepEquals(this.userID, other.userID) &&
            Objects.deepEquals(this.creatorID, other.creatorID) &&
            Objects.deepEquals(this.deliveryUsageMins, other.deliveryUsageMins) &&
            Objects.deepEquals(this.totalUsageMins, other.totalUsageMins) &&
            Objects.deepEquals(this.storageUsageMins, other.storageUsageMins);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            userID,
            creatorID,
            deliveryUsageMins,
            totalUsageMins,
            storageUsageMins);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UsageMetric.class,
                "userID", userID,
                "creatorID", creatorID,
                "deliveryUsageMins", deliveryUsageMins,
                "totalUsageMins", totalUsageMins,
                "storageUsageMins", storageUsageMins);
    }
    
    public final static class Builder {
 
        private Optional<String> userID = Optional.empty();
 
        private Optional<String> creatorID = Optional.empty();
 
        private Optional<Double> deliveryUsageMins = Optional.empty();
 
        private Optional<Double> totalUsageMins = Optional.empty();
 
        private Optional<Double> storageUsageMins = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The user ID associated with the metric
         */
        public Builder userID(String userID) {
            Utils.checkNotNull(userID, "userID");
            this.userID = Optional.ofNullable(userID);
            return this;
        }

        /**
         * The user ID associated with the metric
         */
        public Builder userID(Optional<String> userID) {
            Utils.checkNotNull(userID, "userID");
            this.userID = userID;
            return this;
        }

        /**
         * The creator ID associated with the metric
         */
        public Builder creatorID(String creatorID) {
            Utils.checkNotNull(creatorID, "creatorID");
            this.creatorID = Optional.ofNullable(creatorID);
            return this;
        }

        /**
         * The creator ID associated with the metric
         */
        public Builder creatorID(Optional<String> creatorID) {
            Utils.checkNotNull(creatorID, "creatorID");
            this.creatorID = creatorID;
            return this;
        }

        /**
         * Total minutes of delivery usage.
         */
        public Builder deliveryUsageMins(double deliveryUsageMins) {
            Utils.checkNotNull(deliveryUsageMins, "deliveryUsageMins");
            this.deliveryUsageMins = Optional.ofNullable(deliveryUsageMins);
            return this;
        }

        /**
         * Total minutes of delivery usage.
         */
        public Builder deliveryUsageMins(Optional<Double> deliveryUsageMins) {
            Utils.checkNotNull(deliveryUsageMins, "deliveryUsageMins");
            this.deliveryUsageMins = deliveryUsageMins;
            return this;
        }

        /**
         * Total transcoded minutes.
         */
        public Builder totalUsageMins(double totalUsageMins) {
            Utils.checkNotNull(totalUsageMins, "totalUsageMins");
            this.totalUsageMins = Optional.ofNullable(totalUsageMins);
            return this;
        }

        /**
         * Total transcoded minutes.
         */
        public Builder totalUsageMins(Optional<Double> totalUsageMins) {
            Utils.checkNotNull(totalUsageMins, "totalUsageMins");
            this.totalUsageMins = totalUsageMins;
            return this;
        }

        /**
         * Total minutes of storage usage.
         */
        public Builder storageUsageMins(double storageUsageMins) {
            Utils.checkNotNull(storageUsageMins, "storageUsageMins");
            this.storageUsageMins = Optional.ofNullable(storageUsageMins);
            return this;
        }

        /**
         * Total minutes of storage usage.
         */
        public Builder storageUsageMins(Optional<Double> storageUsageMins) {
            Utils.checkNotNull(storageUsageMins, "storageUsageMins");
            this.storageUsageMins = storageUsageMins;
            return this;
        }
        
        public UsageMetric build() {
            return new UsageMetric(
                userID,
                creatorID,
                deliveryUsageMins,
                totalUsageMins,
                storageUsageMins);
        }
    }
}

