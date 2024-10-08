/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.operations;

import java.lang.String;
import java.util.List;
import java.util.Optional;
import studio.livepeer.livepeer.models.components.AssetPatchPayload;
import studio.livepeer.livepeer.models.components.ClipPayload;
import studio.livepeer.livepeer.models.components.MultistreamTargetInput;
import studio.livepeer.livepeer.models.components.MultistreamTargetPatchPayload;
import studio.livepeer.livepeer.models.components.NewAssetFromUrlPayload;
import studio.livepeer.livepeer.models.components.NewAssetPayload;
import studio.livepeer.livepeer.models.components.NewStreamPayload;
import studio.livepeer.livepeer.models.components.RoomEgressPayload;
import studio.livepeer.livepeer.models.components.RoomUserPayload;
import studio.livepeer.livepeer.models.components.RoomUserUpdatePayload;
import studio.livepeer.livepeer.models.components.StreamPatchPayload;
import studio.livepeer.livepeer.models.components.TargetAddPayload;
import studio.livepeer.livepeer.models.components.TranscodePayload;
import studio.livepeer.livepeer.models.components.WebhookInput;

public class SDKMethodInterfaces {


    public interface MethodCallCreateStream {
        studio.livepeer.livepeer.models.operations.CreateStreamResponse create(
            NewStreamPayload request) throws Exception;
    }


    public interface MethodCallGetStreams {
        studio.livepeer.livepeer.models.operations.GetStreamsResponse getAll(
            Optional<String> streamsonly) throws Exception;
    }


    public interface MethodCallGetStream {
        studio.livepeer.livepeer.models.operations.GetStreamResponse get(
            String id) throws Exception;
    }


    public interface MethodCallUpdateStream {
        studio.livepeer.livepeer.models.operations.UpdateStreamResponse update(
            String id,
            StreamPatchPayload streamPatchPayload) throws Exception;
    }


    public interface MethodCallDeleteStream {
        studio.livepeer.livepeer.models.operations.DeleteStreamResponse delete(
            String id) throws Exception;
    }


    public interface MethodCallTerminateStream {
        studio.livepeer.livepeer.models.operations.TerminateStreamResponse terminate(
            String id) throws Exception;
    }


    public interface MethodCallStartPullStream {
        studio.livepeer.livepeer.models.operations.StartPullStreamResponse startPull(
            String id) throws Exception;
    }


    public interface MethodCallCreateClip {
        studio.livepeer.livepeer.models.operations.CreateClipResponse createClip(
            ClipPayload request) throws Exception;
    }


    public interface MethodCallGetClips {
        studio.livepeer.livepeer.models.operations.GetClipsResponse getClips(
            String id) throws Exception;
    }


    public interface MethodCallAddMultistreamTarget {
        studio.livepeer.livepeer.models.operations.AddMultistreamTargetResponse addMultistreamTarget(
            String id,
            TargetAddPayload targetAddPayload) throws Exception;
    }


    public interface MethodCallRemoveMultistreamTarget {
        studio.livepeer.livepeer.models.operations.RemoveMultistreamTargetResponse removeMultistreamTarget(
            String id,
            String targetId) throws Exception;
    }


    public interface MethodCallGetMultistreamTargets {
        studio.livepeer.livepeer.models.operations.GetMultistreamTargetsResponse getAllDirect() throws Exception;
    }


    public interface MethodCallCreateMultistreamTarget {
        studio.livepeer.livepeer.models.operations.CreateMultistreamTargetResponse create(
            MultistreamTargetInput request) throws Exception;
    }


    public interface MethodCallGetMultistreamTarget {
        studio.livepeer.livepeer.models.operations.GetMultistreamTargetResponse get(
            String id) throws Exception;
    }


    public interface MethodCallUpdateMultistreamTarget {
        studio.livepeer.livepeer.models.operations.UpdateMultistreamTargetResponse update(
            String id,
            MultistreamTargetPatchPayload multistreamTargetPatchPayload) throws Exception;
    }


    public interface MethodCallDeleteMultistreamTarget {
        studio.livepeer.livepeer.models.operations.DeleteMultistreamTargetResponse delete(
            String id) throws Exception;
    }


    public interface MethodCallGetWebhooks {
        studio.livepeer.livepeer.models.operations.GetWebhooksResponse getAllDirect() throws Exception;
    }


    public interface MethodCallCreateWebhook {
        studio.livepeer.livepeer.models.operations.CreateWebhookResponse create(
            WebhookInput request) throws Exception;
    }


    public interface MethodCallGetWebhook {
        studio.livepeer.livepeer.models.operations.GetWebhookResponse get(
            String id) throws Exception;
    }


    public interface MethodCallUpdateWebhook {
        studio.livepeer.livepeer.models.operations.UpdateWebhookResponse update(
            String id,
            WebhookInput webhook) throws Exception;
    }


    public interface MethodCallDeleteWebhook {
        studio.livepeer.livepeer.models.operations.DeleteWebhookResponse delete(
            String id) throws Exception;
    }


    public interface MethodCallGetWebhookLogs {
        studio.livepeer.livepeer.models.operations.GetWebhookLogsResponse getLogs(
            String id) throws Exception;
    }


    public interface MethodCallGetWebhookLog {
        studio.livepeer.livepeer.models.operations.GetWebhookLogResponse getLog(
            String id,
            String logId) throws Exception;
    }


    public interface MethodCallResendWebhook {
        studio.livepeer.livepeer.models.operations.ResendWebhookResponse resendLog(
            String id,
            String logId) throws Exception;
    }


    public interface MethodCallGetAssets {
        studio.livepeer.livepeer.models.operations.GetAssetsResponse getAllDirect() throws Exception;
    }


    public interface MethodCallRequestUpload {
        studio.livepeer.livepeer.models.operations.RequestUploadResponse create(
            NewAssetPayload request) throws Exception;
    }


    public interface MethodCallUploadAsset {
        studio.livepeer.livepeer.models.operations.UploadAssetResponse createViaUrl(
            NewAssetFromUrlPayload request) throws Exception;
    }


    public interface MethodCallGetAsset {
        studio.livepeer.livepeer.models.operations.GetAssetResponse get(
            String assetId) throws Exception;
    }


    public interface MethodCallUpdateAsset {
        studio.livepeer.livepeer.models.operations.UpdateAssetResponse update(
            String assetId,
            AssetPatchPayload assetPatchPayload) throws Exception;
    }


    public interface MethodCallDeleteAsset {
        studio.livepeer.livepeer.models.operations.DeleteAssetResponse delete(
            String assetId) throws Exception;
    }


    public interface MethodCallGetSessionClips {
        studio.livepeer.livepeer.models.operations.GetSessionClipsResponse getClips(
            String id) throws Exception;
    }


    public interface MethodCallGetSessions {
        studio.livepeer.livepeer.models.operations.GetSessionsResponse getAllDirect() throws Exception;
    }


    public interface MethodCallGetSession {
        studio.livepeer.livepeer.models.operations.GetSessionResponse get(
            String id) throws Exception;
    }


    public interface MethodCallGetRecordedSessions {
        studio.livepeer.livepeer.models.operations.GetRecordedSessionsResponse getRecorded(
            String parentId,
            Optional<? extends Record> record) throws Exception;
    }


    public interface MethodCallCreateRoom {
        studio.livepeer.livepeer.models.operations.CreateRoomResponse createDirect() throws Exception;
    }


    public interface MethodCallGetRoom {
        studio.livepeer.livepeer.models.operations.GetRoomResponse get(
            String id) throws Exception;
    }


    public interface MethodCallDeleteRoom {
        studio.livepeer.livepeer.models.operations.DeleteRoomResponse delete(
            String id) throws Exception;
    }


    public interface MethodCallStartRoomEgress {
        studio.livepeer.livepeer.models.operations.StartRoomEgressResponse startEgress(
            String id,
            RoomEgressPayload roomEgressPayload) throws Exception;
    }


    public interface MethodCallStopRoomEgress {
        studio.livepeer.livepeer.models.operations.StopRoomEgressResponse stopEgress(
            String id) throws Exception;
    }


    public interface MethodCallCreateRoomUser {
        studio.livepeer.livepeer.models.operations.CreateRoomUserResponse createUser(
            String id,
            RoomUserPayload roomUserPayload) throws Exception;
    }


    public interface MethodCallGetRoomUser {
        studio.livepeer.livepeer.models.operations.GetRoomUserResponse getUser(
            String id,
            String userId) throws Exception;
    }


    public interface MethodCallUpdateRoomUser {
        studio.livepeer.livepeer.models.operations.UpdateRoomUserResponse updateUser(
            String id,
            String userId,
            RoomUserUpdatePayload roomUserUpdatePayload) throws Exception;
    }


    public interface MethodCallDeleteRoomUser {
        studio.livepeer.livepeer.models.operations.DeleteRoomUserResponse deleteUser(
            String id,
            String userId) throws Exception;
    }


    public interface MethodCallGetRealtimeViewershipNow {
        studio.livepeer.livepeer.models.operations.GetRealtimeViewershipNowResponse getRealtimeViewership(
            Optional<String> playbackId,
            Optional<String> creatorId,
            Optional<? extends List<BreakdownBy>> breakdownBy) throws Exception;
    }


    public interface MethodCallGetViewershipMetrics {
        studio.livepeer.livepeer.models.operations.GetViewershipMetricsResponse getViewership(
            GetViewershipMetricsRequest request) throws Exception;
    }


    public interface MethodCallGetCreatorViewershipMetrics {
        studio.livepeer.livepeer.models.operations.GetCreatorViewershipMetricsResponse getCreatorViewership(
            GetCreatorViewershipMetricsRequest request) throws Exception;
    }


    public interface MethodCallGetPublicViewershipMetrics {
        studio.livepeer.livepeer.models.operations.GetPublicViewershipMetricsResponse getPublicViewership(
            String playbackId) throws Exception;
    }


    public interface MethodCallGetUsageMetrics {
        studio.livepeer.livepeer.models.operations.GetUsageMetricsResponse getUsage(
            GetUsageMetricsRequest request) throws Exception;
    }


    public interface MethodCallCreateSigningKey {
        studio.livepeer.livepeer.models.operations.CreateSigningKeyResponse createDirect() throws Exception;
    }


    public interface MethodCallGetSigningKeys {
        studio.livepeer.livepeer.models.operations.GetSigningKeysResponse getAllDirect() throws Exception;
    }


    public interface MethodCallDeleteSigningKey {
        studio.livepeer.livepeer.models.operations.DeleteSigningKeyResponse delete(
            String keyId) throws Exception;
    }


    public interface MethodCallGetSigningKey {
        studio.livepeer.livepeer.models.operations.GetSigningKeyResponse get(
            String keyId) throws Exception;
    }


    public interface MethodCallUpdateSigningKey {
        studio.livepeer.livepeer.models.operations.UpdateSigningKeyResponse update(
            String keyId,
            UpdateSigningKeyRequestBody requestBody) throws Exception;
    }


    public interface MethodCallGetTasks {
        studio.livepeer.livepeer.models.operations.GetTasksResponse getAllDirect() throws Exception;
    }


    public interface MethodCallGetTask {
        studio.livepeer.livepeer.models.operations.GetTaskResponse get(
            String taskId) throws Exception;
    }


    public interface MethodCallTranscodeVideo {
        studio.livepeer.livepeer.models.operations.TranscodeVideoResponse create(
            TranscodePayload request) throws Exception;
    }


    public interface MethodCallGetPlaybackInfo {
        studio.livepeer.livepeer.models.operations.GetPlaybackInfoResponse get(
            String id) throws Exception;
    }


}
