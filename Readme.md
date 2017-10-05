react-native-opentok
====================

> React Native SDK for OpenTok platform.

### Props

Prop | Type  
------------ | -------------
apiKey | string
sessionId | string
token | string
cameraPosition | string 'front' or 'back' (only for publisher)
------------ | -------------
spinnerContainerStyle | object or number
------------ | -------------
onPublishStart | function
onPublishError | function
onPublishStop | function
------------ | -------------
onSubscribeStart | function
onSubscribeError | function
onSubscribeStop | function
------------ | -------------
publishAudio | bool
publishVideo | bool

### Basic usage

#### Publisher

```js
import { PublisherView } from 'react-native-opentok';

export default function Publisher() {
  return (
    <PublisherView
      apiKey={OPENTOK_API_KEY}
      sessionId={OPENTOK_SESSION_ID}
      token={OPENTOK_PUBLISHER_TOKEN}
      style={{ width: 300, height: 200 }}
    />
  );
}
```

#### Subscriber

```js
import { SubscriberView } from 'react-native-opentok';

export default function Subscriber() {
  return (
    <SubscriberView
      apiKey={OPENTOK_API_KEY}
      sessionId={OPENTOK_SESSION_ID}
      token={OPENTOK_SUBSCRIBER_TOKEN}
      style={{ width: 300, height: 200 }}
    />
  );
}
```

#### Signaling

```js
import { Session } from 'react-native-opentok';

Session.connect(OPENTOK_API_KEY, SESSION_ID, PUBLISHER_TOKEN || SUBSCRIBER_TOKEN);
Session.onMessageRecieved((e) => console.log(e));
Session.sendMessage('message');
```
