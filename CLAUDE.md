# murdho.com

A single static page. No build step: `index.html` plus hand-written
`static/style.css`. Tailwind was removed once the redesign stopped using it.

## Cache busting — bump this whenever CSS changes

`static/style.css` is linked with a version query:

```html
<link href="/static/style.css?v=202608251956" rel="stylesheet"/>
```

**After editing `static/style.css`, update `v` to the current UTC timestamp:**

```bash
date -u "+%Y%m%d%H%M"    # e.g. 202608251956
```

GitHub Pages serves everything with `cache-control: max-age=600`, so a
returning visitor can hold a stale copy for up to ten minutes. Bumping `v`
does not shorten that wait — the HTML is cached for ten minutes too — but it
does guarantee HTML and CSS move together, instead of new markup rendering
against ten-minute-old styles.

Nothing else needs a version query: the font filenames are stable and their
contents never change. `static/murdho.webp` / `.png` would need the same
treatment only if the avatar is ever replaced without renaming it.

## Development

```bash
bundle      # installs webrick
bin/dev     # static server on :3000
```

## Conventions

- Colours come from the portrait in `static/murdho.png`, sampled rather than
  invented. They live as tokens at the top of `static/style.css`.
- Three faces, one job each: Big Shoulders Display for the name, Space
  Grotesk for labels, JetBrains Mono for data. All self-hosted.
- Motion is guarded behind `prefers-reduced-motion`, and pointer effects
  behind a fine-pointer check.
- `--blink-floor` controls how far a flickering element may dim. It is set
  per element because a dark colour hits the background far sooner than a
  light one at the same opacity — never let anything reach zero.
