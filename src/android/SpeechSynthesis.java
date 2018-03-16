 @Override
                    public void onRangeStart(String utteranceId, int start, int end, int frame){
                        JSONObject event = new JSONObject();
                        event.put("type","boundry");
                        event.put("charIndex",start);
                        event.put("elapsedTime",end);
                        event.put("name",frame);
                        PluginResult pr = new PluginResult(PluginResult.Status.OK, event);
                        pr.setKeepCallback(true);
                        callbackContext.sendPluginResult(pr);
                    }
