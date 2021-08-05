/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.wbd101.hrvrecord;

public class AndroidHRVAPIJNI {
  public final static native long hrv_result_t_total_rr_cnt_get(long jarg1, hrv_result_t jarg1_);
  public final static native int hrv_result_t_window_rr_cnt_get(long jarg1, hrv_result_t jarg1_);
  public final static native int hrv_result_t_valid_rr_cnt_get(long jarg1, hrv_result_t jarg1_);
  public final static native int hrv_result_t_result_timestamp_get(long jarg1, hrv_result_t jarg1_);
  public final static native byte hrv_result_t_result_conf_level_get(long jarg1, hrv_result_t jarg1_);
  public final static native short hrv_result_t_stress_index_get(long jarg1, hrv_result_t jarg1_);
  public final static native byte hrv_result_t_pNN50_get(long jarg1, hrv_result_t jarg1_);
  public final static native float hrv_result_t_rMSSD_get(long jarg1, hrv_result_t jarg1_);
  public final static native float hrv_result_t_SDNN180_get(long jarg1, hrv_result_t jarg1_);
  public final static native float hrv_result_t_HRV_Score_get(long jarg1, hrv_result_t jarg1_);
  public final static native float hrv_result_t_dfa_slope1_get(long jarg1, hrv_result_t jarg1_);
  public final static native float hrv_result_t_dfa_slope2_get(long jarg1, hrv_result_t jarg1_);
  public final static native byte hrv_result_t_respiratory_rate_get(long jarg1, hrv_result_t jarg1_);
  public final static native float hrv_result_t_vlf_get(long jarg1, hrv_result_t jarg1_);
  public final static native float hrv_result_t_lf_get(long jarg1, hrv_result_t jarg1_);
  public final static native float hrv_result_t_hf_get(long jarg1, hrv_result_t jarg1_);
  public final static native float hrv_result_t_lf_nu_get(long jarg1, hrv_result_t jarg1_);
  public final static native float hrv_result_t_hf_nu_get(long jarg1, hrv_result_t jarg1_);
  public final static native float hrv_result_t_lf_to_hf_get(long jarg1, hrv_result_t jarg1_);
  public final static native float hrv_result_t_total_power_get(long jarg1, hrv_result_t jarg1_);
  public final static native long new_hrv_result_t();
  public final static native void delete_hrv_result_t(long jarg1);
  public final static native long HRV_Get_Analysis_Result();
  public final static native void init_hrv_analysis();
  public final static native void hrv_analysis(int jarg1, short jarg2, short jarg3);
}
