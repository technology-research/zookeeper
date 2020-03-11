// File generated by hadoop record compiler. Do not edit.
/**
* Licensed to the Apache Software Foundation (ASF) under one
* or more contributor license agreements.  See the NOTICE file
* distributed with this work for additional information
* regarding copyright ownership.  The ASF licenses this file
* to you under the Apache License, Version 2.0 (the
* "License"); you may not use this file except in compliance
* with the License.  You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package org.apache.zookeeper.proto;

import org.apache.jute.*;
import org.apache.yetus.audience.InterfaceAudience;
import org.apache.zookeeper.data.Stat;

@InterfaceAudience.Public
public class SetDataResponse implements Record {
  private Stat stat;
  public SetDataResponse() {
  }
  public SetDataResponse(
        Stat stat) {
    this.stat=stat;
  }
  public Stat getStat() {
    return stat;
  }
  public void setStat(Stat m_) {
    stat=m_;
  }
  public void serialize(OutputArchive a_, String tag) throws java.io.IOException {
    a_.startRecord(this,tag);
    a_.writeRecord(stat,"stat");
    a_.endRecord(this,tag);
  }
  public void deserialize(InputArchive a_, String tag) throws java.io.IOException {
    a_.startRecord(tag);
    stat= new Stat();
    a_.readRecord(stat,"stat");
    a_.endRecord(tag);
}
  public String toString() {
    try {
      java.io.ByteArrayOutputStream s =
        new java.io.ByteArrayOutputStream();
      CsvOutputArchive a_ = 
        new CsvOutputArchive(s);
      a_.startRecord(this,"");
    a_.writeRecord(stat,"stat");
      a_.endRecord(this,"");
      return new String(s.toByteArray(), "UTF-8");
    } catch (Throwable ex) {
      ex.printStackTrace();
    }
    return "ERROR";
  }
  public void write(java.io.DataOutput out) throws java.io.IOException {
    BinaryOutputArchive archive = new BinaryOutputArchive(out);
    serialize(archive, "");
  }
  public void readFields(java.io.DataInput in) throws java.io.IOException {
    BinaryInputArchive archive = new BinaryInputArchive(in);
    deserialize(archive, "");
  }
  public int compareTo (Object peer_) throws ClassCastException {
    if (!(peer_ instanceof SetDataResponse)) {
      throw new ClassCastException("Comparing different types of records.");
    }
    SetDataResponse peer = (SetDataResponse) peer_;
    int ret = 0;
    ret = stat.compareTo(peer.stat);
    if (ret != 0) return ret;
     return ret;
  }
  public boolean equals(Object peer_) {
    if (!(peer_ instanceof SetDataResponse)) {
      return false;
    }
    if (peer_ == this) {
      return true;
    }
    SetDataResponse peer = (SetDataResponse) peer_;
    boolean ret = false;
    ret = stat.equals(peer.stat);
    if (!ret) return ret;
     return ret;
  }
  public int hashCode() {
    int result = 17;
    int ret;
    ret = stat.hashCode();
    result = 37*result + ret;
    return result;
  }
  public static String signature() {
    return "LSetDataResponse(LStat(lllliiiliil))";
  }
}
