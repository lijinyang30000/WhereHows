/**
 * Copyright 2015 LinkedIn Corp. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
package wherehows.models;

import java.util.List;


public class DatasetPrivacyCompliance {

  private Integer datasetId;
  private String datasetUrn;
  private String complianceType;
  private List<DatasetFieldEntity> compliancePurgeEntities;
  private Long modifiedTime;

  public DatasetPrivacyCompliance() {
  }

  public Integer getDatasetId() {
    return datasetId;
  }

  public void setDatasetId(Integer datasetId) {
    this.datasetId = datasetId;
  }

  public String getDatasetUrn() {
    return datasetUrn;
  }

  public void setDatasetUrn(String datasetUrn) {
    this.datasetUrn = datasetUrn;
  }

  public String getComplianceType() {
    return complianceType;
  }

  public void setComplianceType(String complianceType) {
    this.complianceType = complianceType;
  }

  public List<DatasetFieldEntity> getCompliancePurgeEntities() {
    return compliancePurgeEntities;
  }

  public void setCompliancePurgeEntities(List<DatasetFieldEntity> compliancePurgeEntities) {
    this.compliancePurgeEntities = compliancePurgeEntities;
  }

  public Long getModifiedTime() {
    return modifiedTime;
  }

  public void setModifiedTime(Long modifiedTime) {
    this.modifiedTime = modifiedTime;
  }
}
