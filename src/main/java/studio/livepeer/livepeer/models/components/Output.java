/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import studio.livepeer.livepeer.utils.Utils;

/**
 * Output - Output of the task
 */

public class Output {

    /**
     * Output of the upload task
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("upload")
    private Optional<? extends Map<String, Object>> upload;

    /**
     * Output of the export task
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("export")
    private Optional<? extends Export> export;

    /**
     * Output of the export data task
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("exportData")
    private Optional<? extends ExportData> exportData;

    @JsonCreator
    public Output(
            @JsonProperty("upload") Optional<? extends Map<String, Object>> upload,
            @JsonProperty("export") Optional<? extends Export> export,
            @JsonProperty("exportData") Optional<? extends ExportData> exportData) {
        Utils.checkNotNull(upload, "upload");
        Utils.checkNotNull(export, "export");
        Utils.checkNotNull(exportData, "exportData");
        this.upload = upload;
        this.export = export;
        this.exportData = exportData;
    }
    
    public Output() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Output of the upload task
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, Object>> upload() {
        return (Optional<Map<String, Object>>) upload;
    }

    /**
     * Output of the export task
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Export> export() {
        return (Optional<Export>) export;
    }

    /**
     * Output of the export data task
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ExportData> exportData() {
        return (Optional<ExportData>) exportData;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Output of the upload task
     */
    public Output withUpload(Map<String, Object> upload) {
        Utils.checkNotNull(upload, "upload");
        this.upload = Optional.ofNullable(upload);
        return this;
    }

    /**
     * Output of the upload task
     */
    public Output withUpload(Optional<? extends Map<String, Object>> upload) {
        Utils.checkNotNull(upload, "upload");
        this.upload = upload;
        return this;
    }

    /**
     * Output of the export task
     */
    public Output withExport(Export export) {
        Utils.checkNotNull(export, "export");
        this.export = Optional.ofNullable(export);
        return this;
    }

    /**
     * Output of the export task
     */
    public Output withExport(Optional<? extends Export> export) {
        Utils.checkNotNull(export, "export");
        this.export = export;
        return this;
    }

    /**
     * Output of the export data task
     */
    public Output withExportData(ExportData exportData) {
        Utils.checkNotNull(exportData, "exportData");
        this.exportData = Optional.ofNullable(exportData);
        return this;
    }

    /**
     * Output of the export data task
     */
    public Output withExportData(Optional<? extends ExportData> exportData) {
        Utils.checkNotNull(exportData, "exportData");
        this.exportData = exportData;
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
        Output other = (Output) o;
        return 
            Objects.deepEquals(this.upload, other.upload) &&
            Objects.deepEquals(this.export, other.export) &&
            Objects.deepEquals(this.exportData, other.exportData);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            upload,
            export,
            exportData);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Output.class,
                "upload", upload,
                "export", export,
                "exportData", exportData);
    }
    
    public final static class Builder {
 
        private Optional<? extends Map<String, Object>> upload = Optional.empty();
 
        private Optional<? extends Export> export = Optional.empty();
 
        private Optional<? extends ExportData> exportData = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Output of the upload task
         */
        public Builder upload(Map<String, Object> upload) {
            Utils.checkNotNull(upload, "upload");
            this.upload = Optional.ofNullable(upload);
            return this;
        }

        /**
         * Output of the upload task
         */
        public Builder upload(Optional<? extends Map<String, Object>> upload) {
            Utils.checkNotNull(upload, "upload");
            this.upload = upload;
            return this;
        }

        /**
         * Output of the export task
         */
        public Builder export(Export export) {
            Utils.checkNotNull(export, "export");
            this.export = Optional.ofNullable(export);
            return this;
        }

        /**
         * Output of the export task
         */
        public Builder export(Optional<? extends Export> export) {
            Utils.checkNotNull(export, "export");
            this.export = export;
            return this;
        }

        /**
         * Output of the export data task
         */
        public Builder exportData(ExportData exportData) {
            Utils.checkNotNull(exportData, "exportData");
            this.exportData = Optional.ofNullable(exportData);
            return this;
        }

        /**
         * Output of the export data task
         */
        public Builder exportData(Optional<? extends ExportData> exportData) {
            Utils.checkNotNull(exportData, "exportData");
            this.exportData = exportData;
            return this;
        }
        
        public Output build() {
            return new Output(
                upload,
                export,
                exportData);
        }
    }
}

